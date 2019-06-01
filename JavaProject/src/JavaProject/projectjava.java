
package JavaProject;

public class projectjava {

    public static void main(String[] args) {
       frame1 x=new frame1();
       
  
    }

}// //array and linked list
//       //LinkedList
//      ArrayList<String> id = new ArrayList<>();
//        id.add("20180166");
//        id.add("20180167");
//        id.add("20180168");
//        id.add("20180169");
////        id.remove("20180168");
////        id.clear();
////        id.contains("20180170");
////        id.get(0);
////        id.size();
////Collections.sort(id);
////Collections.max(id);
////Collections.min(id);
////Collections.reverse(id);
//     Iterator<String> it = id.iterator();
//    while(it.hasNext()) {
//      String value = it.next();
//      System.out.println(value);   
//     }
////  it.hasNext();
////  it.remove();
//Collections.shuffle(id);
//System.out.println(id);
//
//
//
//
////hash table
//  HashMap<String, Integer> idh = new HashMap<>();
//    idh.put("Osama", 20180166);
//    idh.put("mohamed", 20180167);
//    idh.put("ahmad", 20180168);
//    idh.put("sara", 20180169);
//    //idh.remove("Osama");
//    System.out.println(idh.get("Osama")); 
//    
//    
//    
//    //set
//     HashSet<String> set = new HashSet<>();
//    set.add("A");
//    set.add("B");
//    set.add("C");
//    System.out.println(set);
//   //files
//   try {
//      File x = new File("C:\\.txt");
//    if(x.exists()) {
//     System.out.println(x.getName() +  "exists!");
//    }
//    else { 
//     System.out.println("The file does not exist");
//    }
//   
//  Scanner sc = new Scanner(x);
//  while(sc.hasNext()) {
//    System.out.println(sc.next());
//  }
//  sc.close();
//} catch (FileNotFoundException e) {
//  System.out.println("Error");
//}
//     try {
//    Formatter f = new Formatter("C:\\.txt");
//    f.format("%s %s %s", "1","osama", "20180166 \r\n");
//    f.format("%s %s %s", "2","ahmad", "20180167");
//    f.close();    
//  } catch (FileNotFoundException e) {
//    System.out.println("Error");
//  }
////- Use an ArrayList when you need rapid access to your data. 
////- Use a LinkedList when you need to make a large number of inserts and/or deletes.
//it.next() returns the first element in the list and then moves the iterator on to the next element.
//Each time you call it.next(), the iterator moves to the next element of the list.