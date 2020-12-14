public class People {
  public static void main ( String[] args ) {
    Teacher tanaka = new Teacher("田中", "元気ですか？",10);
    Teacher yamamoto = new Teacher("山本", "出席たりてますか？",8);
    Teacher yoshino = new Teacher("吉野", "ALOHA!",5);
    tanaka.hello();
    yamamoto.hello();
    yoshino.hello();
  }
}
class Teacher {
  String msg = "";
  String name = "";

  Teacher( String name,String kotoba ) {
    msg = kotoba;
    name = namae;
  }

  public void hello() {
   System.out.println(name+ "です"+ msg );
  }
}
public static void attack(Teacher a,Teacher b){
  int damage = 5;
  int newHp = b.hp-damage;
  if(hp ==0){
    System.out.println(b + "は死んでしまった!");
  }
}