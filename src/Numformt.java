import org.junit.Test;

/**
 * @Author 乘梦碧溪
 * @Description //TODO 有效位数测试$
 * @Date 2020/9/13 16:38
 * @Version 1.0
 */
public class Numformt {
    public  double roundToSignificantFigures(double num, int n) {
        if(num == 0) {
            return 0;
        }

         double d = Math.ceil(Math.log10(num < 0 ? -num: num));
         int power = n - (int) d;

         double magnitude = Math.pow(10, power);
         long shifted = Math.round(num*magnitude);
        return shifted/magnitude;
    }
    @Test
    public void numformt(){
        double x = roundToSignificantFigures(12.009,4);
        System.out.println(x);
    }
}
