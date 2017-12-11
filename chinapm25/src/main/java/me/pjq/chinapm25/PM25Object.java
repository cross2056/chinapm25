package me.pjq.chinapm25;


/**
 * Created by pjq on 1/21/15.
 */
public class PM25Object {
    String cityPingyin;
    String cityChinese;
    String pm25;

    public int getIndeOfAll() {
        return indeOfAll;
    }

    public void setIndeOfAll(int indeOfAll) {
        this.indeOfAll = indeOfAll;
    }

    int indeOfAll;

    public PM25Object(String cityPingyin, String cityChinese, String pm25) {
        this.cityPingyin = cityPingyin;
        this.cityChinese = cityChinese;
        this.pm25 = pm25;
    }

    public String getCityPingyin() {
        return cityPingyin;
    }

    public void setCityPingyin(String cityPingyin) {
        this.cityPingyin = cityPingyin;
    }

    public String getCityChinese() {
        return cityChinese;
    }

    public void setCityChinese(String cityChinese) {
        this.cityChinese = cityChinese;
    }

    public String getPm25() {
        return pm25;
    }

    public int getPm25Int() {
        try{
            return Integer.valueOf(pm25);
        }catch (Exception e){
            e.printStackTrace();
        }

        return 0;
    }

    public void setPm25(String pm25) {
        this.pm25 = pm25;
    }


}
