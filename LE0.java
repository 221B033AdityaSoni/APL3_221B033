public class Main
{
    int speed;
    String name;
    
    void setname( String name){
        this.name = name;
    }
    void setspeed( int speed){
        this.speed = speed;
    }
    
    String getname(){
        return this.name;
    }
    int getspeed(){
        return this.speed;
        
    } 
    
	public static void main(String[] args) {
	     Main m1 = new Main();
         m1.setname("Honda");
         m1.setspeed(50);
	   System.out.println(m1.getname() + " " + m1.getspeed() );
	}
}