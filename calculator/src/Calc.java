import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calc {
    public String calc(String formula){
        String[] form = formula.split(" ");
        List<String> formulalist = new ArrayList<>(Arrays.asList(form));
        System.out.println(form);

        System.out.println(formulalist);
        for (int i = 0;i < formulalist.size();i++){
            if(formulalist.get(i).equals("×")){
                float bef = Float.parseFloat(formulalist.get(i - 1));
                float aft = Float.parseFloat(formulalist.get(i + 1));
                String answer = Float.toString(bef * aft);
                System.out.println(answer);
                formulalist.set(i - 1,answer);
                formulalist.remove(i);
                formulalist.remove(i);
                i = 0;
            }
            if (formulalist.get(i).equals("÷")){
                float bef = Float.parseFloat(formulalist.get(i - 1));
                float aft = Float.parseFloat(formulalist.get(i + 1));
                String answer = Float.toString(bef / aft);
                System.out.println(answer);
                formulalist.set(i - 1,answer);
                formulalist.remove(i);
                formulalist.remove(i);
                i = 0;
            }
        }
        for (int i = 0;i < formulalist.size();i++){
            if(formulalist.get(i).equals("+")){
                float bef = Float.parseFloat(formulalist.get(i - 1));
                float aft = Float.parseFloat(formulalist.get(i + 1));
                String answer = Float.toString(bef + aft);
                System.out.println(answer);
                formulalist.set(i - 1,answer);
                formulalist.remove(i);
                formulalist.remove(i);
                i = 0;
            }
            if (formulalist.get(i).equals("-")){
                System.out.println("-");
                float bef = Float.parseFloat(formulalist.get(i - 1));
                float aft = Float.parseFloat(formulalist.get(i + 1));
                String answer = Float.toString(bef - aft);
                System.out.println(answer);
                formulalist.set(i - 1,answer);
                formulalist.remove(i);
                formulalist.remove(i);
                i = 0;
            }
        }
        return(formulalist.get(0));
    }
}
