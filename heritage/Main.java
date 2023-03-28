public class Main {

    public static void main( String[] args ) {

        B mon_b = new B( 10 );
        mon_b.show();

    }

}

class A {

    protected int x, y ;

    A( int x, int y ) {
        this.x = x ;
        this.y = y ;
    }

    A( int x ) {
        this( x, x );
    }

}

class B extends A {

    private int z ;

    B( int m ) {
        super( m );
        this.x = m ;
        this.z = m ;
    }

    public void show() {
        System.out.println( this.z + " - " + this.x + " - " + this.y );
    }

}