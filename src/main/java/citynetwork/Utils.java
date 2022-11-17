package citynetwork;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static boolean isValidCode(String _cityName, String _cityCode) {
        int codeIdx = 0, cityIdx = 0;
        boolean valid = true;

        List<Character> cityChar = new ArrayList<>();
        List<Character> cityCodeChar = new ArrayList<>();
        List<Integer> cityCodeIdx = new ArrayList<>();

        if(_cityCode.contains(" ")){return false;}
        for(int i=0;i<_cityName.length();i++){
            cityChar.add(_cityName.charAt(i));
        }
        for(int i=0;i<_cityCode.length();i++){
            cityCodeChar.add(_cityCode.charAt(i));
        }
        for(char c:cityChar){
            if(codeIdx<_cityCode.length()-1){
                if(c==cityCodeChar.get(codeIdx)){
                    codeIdx++;
                }
            }
        }
        if(codeIdx!=2){
            return false;
        }
        return true;
    }

}
