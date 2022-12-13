import javax.swing.text.html.HTMLDocument;
import java.io.Serializable;
import java.util.*;

public class Main {
    public static void main(String[] args) {


        System.out.println("------java ArrayList--------");


        List list=new ArrayList();

        list.add("a");
        list.add(1);
        list.add("R");
        list.add(null);
        System.out.println(list);
            list.remove(2);
            System.out.println(list);
            list.add(2,"M");
            System.out.println(list);
            list.add("n");
            System.out.println(list);


            System.out.println("--------");
            ArrayList l2= new ArrayList();
        LinkedList l3=new LinkedList();

        System.out.println(l2 instanceof Serializable);
        System.out.println(l3 instanceof Cloneable);
        System.out.println(l2 instanceof RandomAccess);

        System.out.println(l3 instanceof RandomAccess);



      System.out.println("----------------------------------------------------------");

      System.out.println("---Linked list----");

      LinkedList l=new LinkedList();

//      linkedlist ll2= new LinkedList(Collections.unmodifiableCollection());

        l.add("rupesh");
        l.add(null);
        l.add("lila");
        l.set(0,"software");
        l.add(0,"lila");
        l.addFirst("ccc");
        l.addLast("zzz");
        System.out.println(l);

        System.out.println("-----------------------------");
        System.out.println("-----hashSet---------");
        HashSet hashset=new HashSet();
        hashset.add("b");

        hashset.add(10);
        hashset.add("c");
        hashset.add(null);
        hashset.add("b");
        System.out.println(hashset);

        System.out.println("--------------------------");

        System.out.println("-------LinkedHashSet----------");

        Set set=new LinkedHashSet();
      set.add("b");

       set.add(10);
      set.add("c");
      set.add(null);
        set.add("b");

        System.out.println(set);

        System.out.println("-----------------------------------");
        System.out.println("------TreeSet---------");

        TreeSet t=new TreeSet();
//
            t.add("A");
            t.add("b");
            t.add("a");
            t.add("c");
//            t.add(null);//null point exception
            // sorting bu asci value

            System.out.println(t);

            System.out.println("-------------------");
            System.out.println("----------------Iterator-------");

            List itr=new ArrayList();
            itr.add(10);
            itr.add("rupesh");
            itr.add("LILA");
            Iterator itr1=itr.iterator();
            while (itr1.hasNext())
            {
                System.out.println(itr1.next());
            }
            System.out.println("-------------------");
            System.out.println("---------List Iterator-------");


            List l33=new ArrayList();
        l33.add(10);
        l33.add("rupesh");
        l33.add("LILA");

        ListIterator itrl=l33.listIterator();
        while(itrl.hasNext())
        {
            System.out.println(itrl.next());
        }

        while (itrl.hasPrevious())
        {
            System.out.println(itrl.previous());
        }


        System.out.println("-------------------------");
        System.out.println("---Hashmap--------");
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"rupesh");
        map.put(2,"lila");
        map.put(3,"devid");
        map.put(4,"john");
        map.put(5,"rupesh");
        map.put(5,"shubham");
        System.out.println(map);

        System.out.println("----------");
        System.out.println(map.get(5));


        System.out.println("-------------");
        map.remove(4);
        System.out.println(map);
        System.out.println("--------");
        System.out.println(map.containsKey(4));
        System.out.println("--------------------------------");
        System.out.println( map.containsValue("rupesh"));
        System.out.println("-----------------------------------");
        System.out.println(map.isEmpty());
        System.out.println("------------");
        System.out.println(map.keySet());


        for(int i: map.keySet())
        {
            System.out.println(i+"    "+map.get(i));
        }
        System.out.println("--------------------------------");
        System.out.println(map.values());

        for(String i: map.values())
        {
            System.out.println(i);
        }
        System.out.println("------------------------------");
        System.out.println(map.entrySet() );


        System.out.println("=---------------------------");
        System.out.println("-----------entry method----------");
        for (Map.Entry entry:map.entrySet() ){


           System.out.println( entry.getKey()+"     "+entry.getValue());
        }

        System.out.println("-------------------------------");
        System.out.println("---------------iterator-----------------");
        Set s=map.entrySet();
        Iterator iamitr=s.iterator();

        while (iamitr.hasNext())
        {

            Map.Entry entr= (Map.Entry) iamitr.next();

            System.out.println(entr.getKey()+"       "+entr.getValue());
        }



    }


}