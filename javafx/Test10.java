class Student{
	private String name;
    //private String favorite;
    public void setName(String data){
        this.name = data;
    }
    public String getName(){
    	return this.name;
      }
    }
   // public void sayHello(){
	//	System.out.println("Hello! My name is"+ this.name);
   // }
	//public void setFavorite(String suki){
     //   this.favorite = suki;
     //   System.out.println("i love"+ suki);
	//}
public class Test{
	public static void main(String[] args) {
		//System.out.println("hello");
		Student yamada = new Student();
		//yamada.name = "Yamada Taro";
		//yamada.setFavorite("coffee!!");
		//Student tanaka = new Student();
		//tanaka.setName("Tanaka Masahiko");
		//tanaka.setFavorite("Mattcha!!");
		System.out.println( yamada.getName());
	}
}
