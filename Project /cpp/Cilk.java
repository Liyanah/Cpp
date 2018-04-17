import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import java.io.File;
import java.io.FileWriter;
import java.lang.*;

public class Cilk extends cppBaseListener {
    FileWriter writer;
    cppParser parser;
     String[] arr, arr2;
    String f;
    public Cilk(cppParser parser) {this.parser = parser;}

    @Override
    public void enterTranslationunit(cppParser.TranslationunitContext ctx) {


}
//; add new line after it
@Override
public void exitTranslationunit(cppParser.TranslationunitContext ctx) {
  try{
    TokenStream tokens = parser.getTokenStream();

    String t =tokens.getText(ctx);
    boolean b = false ;
    try{
     arr=t.split(f.trim(), 2);
     arr[1]=arr[1].replaceFirst(f, "cilk_spawn " +f);
     System.out.println("---------------arr[0]" );
     System.out.println(arr[0] );
       System.out.println("---------------arr[1]" );
       System.out.println(arr[1] );
     arr2=arr[1].split("return", 3);
     arr2[1]=arr2[1]+"cilk_sync"+"\n return"+arr2[2];
     System.out.println("---------------arr2[0]" );
     System.out.println(arr2[0] );
       System.out.println("---------------arr2[1]" );
       System.out.println(arr2[1] );
     t=arr[0]+f+arr2[0]+arr2[1];
     System.out.println("---------------t" );
     System.out.println(t );
     //-----------

      System.out.println(t);
   writer  =new FileWriter("Output.cpp");
  writer.write("#include <stdio.h>\n#include <stdlib.h>\n#include <time.h>\n#include <cilk/cilk.h>\n#include <cilk/cilk_api.h>\n");
  for (int i=0;i<t.length();i++){
    writer.write(t.charAt(i));
         if (t.charAt(i) == ';'  || t.charAt(i) == '}'  )
         {
           writer.write( "\n");
         }
         if (t.charAt(i) == '{'){
           writer.write("\n");
         }
         else{
           if (t.charAt(i) == '#'){
             b= true;}

             if(b)
             {
               if (t.charAt(i) == '>'){
                 writer.write("\n");
                 b= false;}
             }

         }

}

}catch(Exception e){System.out.println(e);}

 writer.close();
}catch(Exception e){System.out.println(e);}

}

	@Override
public void enterFunctiondefinition(cppParser.FunctiondefinitionContext ctx) {
  TokenStream tokens = parser.getTokenStream();
  try{
    String  t = tokens.getText(ctx.declarator().idexpression());
  if (!t.trim().equals("main") ){
    f = tokens.getText(ctx.declarator().idexpression());
  }
}catch(Exception e){}

 }



}
