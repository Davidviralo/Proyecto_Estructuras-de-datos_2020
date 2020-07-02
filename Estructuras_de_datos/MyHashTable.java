package Estructuras_de_datos;

public class MyHashTable<T>
{
    
    private static final int SIZE = 101;
    private MyArrayList<SinglyLinkedList>  theLists; 
    private int currentSize;

    public MyHashTable( )
    {
        this(SIZE);
    }

    public MyHashTable( int size )
    {
        theLists = new MyArrayList<>(nextPrime( size ));
        for( int i = 0; i < theLists.getCapacity(); i++ )
            theLists.add(i, new SinglyLinkedList<T>( ));
    }

    public void Add( T x )
    {
        SinglyLinkedList<T> listOfHashX = theLists.getItem( myhash( x ));
        if( !listOfHashX.isListed( x ) )
        {
            listOfHashX.pushBack(x );
            if( ++currentSize > theLists.getCapacity())
                rehash( );
        }
    }

    public void Remove( T x )
    {
        SinglyLinkedList<T> listOfHashX = theLists.getItem( myhash( x ));
        if(listOfHashX.isListed( x ) )
            {
                listOfHashX.removeItem(x);
                    currentSize--;
            }
    }

 
    public Boolean Find( T x )
    {
        SinglyLinkedList<T> listOfHashX = theLists.getItem( myhash( x ));
         return listOfHashX.isListed( x );
    }
    
    public T Get( T x )
    {
        SinglyLinkedList<T> listOfHashX = theLists.getItem( myhash( x ));
            if(!listOfHashX.isListed( x )){
              System.out.println("Item T no encontrado. Error");
            }
        return listOfHashX.getItem(listOfHashX.getIndex(x));  
    }

    public void cleanTable( )
    {
        for( int i = 0; i < theLists.getCapacity(); i++ )
            theLists.add(i, new SinglyLinkedList<T>());
        currentSize = 0;    
    }

     public static int hash( String key, int tableSize )
    {
        int hashVal = 0;

        for( int i = 0; i < key.length( ); i++ )
            hashVal = 37 * hashVal + key.charAt( i );

        hashVal %= tableSize;
        if( hashVal < 0 )
            hashVal += tableSize;

        return hashVal;
    }

    private void rehash( )
    {
        MyArrayList<SinglyLinkedList> oldLists = theLists;
        theLists = new MyArrayList<>(nextPrime( 2 * theLists.getCapacity()));
        for( int j = 0; j < theLists.getCapacity(); j++ )
            theLists.add(j, new SinglyLinkedList<T>());

        currentSize = 0;
          for( int j = 0; j < oldLists.getCapacity(); j++ ){
              for( int i = 0; i < oldLists.getItem(j).getSize(); i++ ){
                   Add((T) oldLists.getItem(j).getItem(i));
              }
               
          }
            
    }

    private int myhash( T x )
    {
        int hashVal = x.hashCode();
        hashVal %= theLists.getCapacity();
        if( hashVal < 0 )
            hashVal += theLists.getCapacity();
        return hashVal;
    }

    private static int nextPrime( int n ) 
    {
        if( n % 2 == 0 )
            n++;

        for( ; !isPrime( n ); n += 2 ){
            
        }
        return n;
    }

    /**
     * Not an efficient algorithm.
     */
    private static boolean isPrime( int n )
    {
        if( n == 2 || n == 3 )
            return true;

        if( n == 1 || n % 2 == 0 )
            return false;

        for( int i = 3; i * i <= n; i += 2 )
            if( n % i == 0 )
                return false;

        return true;
    }
    
    /*
     * search_substring
    */
    
    private Boolean AreEqual(String S1, String S2){
            if(S1.length()!=S2.length()){
                return false;
            }
            for(int i=0; i<S1.length(); i++){
                if(S1.charAt(i)!=S2.charAt(i)){
                     return false;
                }
            }
        return true;
    }
    
    private SinglyLinkedList<Integer> FindPatternNaive(String t, String P){
         SinglyLinkedList<Integer> result = new  SinglyLinkedList<>();
         
         for(int i=0; i< t.length()-P.length(); i++){
             if(AreEqual(t.substring(i,P.length()-1),P)){
                 result.pushBack(i);
             }
         }
    
         return result;
    }
    
     
}


