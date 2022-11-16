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

        for(int i=0;i<_cityName.length();i++){
            cityChar.add(_cityName.charAt(i));
        }

        for(int i=0;i<_cityCode.length();i++){
            if(!cityChar.contains(_cityCode.charAt(i))) {
                valid = false;
            }else{
                cityCodeChar.add(_cityCode.charAt(i));
                codeIdx= cityChar.indexOf(_cityCode.charAt(i));
                cityChar.remove(codeIdx);
                cityCodeIdx.add(codeIdx);
            }

        }
        if(valid){
            valid = cityCodeIdx.size()==3;
            for(Character i:cityCodeChar){

                if(cityChar.contains(i)&&valid){
                    valid = false;
                }
            }
            if(valid){
                if(cityCodeIdx.get(0)<cityCodeIdx.get(1)&&cityCodeIdx.get(1)<cityCodeIdx.get(2)){
                    valid = false;
                }
            }
        }

        return valid;
    }

}
