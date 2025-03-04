package Handler;

public class Main {
    public static void main(String[] args) {
      TextFileHandler tfh = new TextFileHandler("1 st handler");
      ImageFileHandler ifh = new ImageFileHandler("2 nd handler");
      DocFileHandler lfh = new DocFileHandler("3 rd handler");
      //โครงลำดับการ test คือ setter
      tfh.setHandler(ifh);//t ก่อน i
      ifh.setHandler(lfh);//i ก่อน l
      tfh.process(new File("demo1","image","C:/OOP"));
      tfh.process(new File("demo2","text","C:/OOP"));
      tfh.process(new File("demo3","doc","C:/OOP"));
    }
    
}
