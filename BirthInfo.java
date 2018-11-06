package com.quinn.study;


public class BirthInfo {

    // 阳历
    private String solarDay; // 日期
    private String time; // 时间，精确到分即可
    private String weekday; // 星期
    private String constellation; // 星座

    // 阴历
    private String lunarYear; // 阴历年
    private String lunarDay; // 阴历月日
    private String period; // 生辰
    private String zodiac; // 属相
    private String bazi; // 八字
    private String wuXing; // 五行
    private String wuXingDesc;

    public String getSolarDay() {
        return solarDay;
    }

    public void setSolarDay(String solarDay) {
        this.solarDay = solarDay;
    }

    public String getWeekday() {
        return weekday;
    }

    public void setWeekday(String weekday) {
        this.weekday = weekday;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getConstellation() {
        return constellation;
    }

    public void setConstellation(String constellation) {
        this.constellation = constellation;
    }

    public String getLunarYear() {
        return lunarYear;
    }

    public void setLunarYear(String lunarYear) {
        this.lunarYear = lunarYear;
    }

    public String getLunarDay() {
        return lunarDay;
    }

    public void setLunarDay(String lunarDay) {
        this.lunarDay = lunarDay;
    }

    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public String getZodiac() {
        return zodiac;
    }

    public void setZodiac(String zodiac) {
        this.zodiac = zodiac;
    }

    public String getBazi() {
        return bazi;
    }

    public void setBazi(String bazi) {
        this.bazi = bazi;
    }

    public String getWuXing() {
        return wuXing;
    }

    public void setWuXing(String wuXing) {
        this.wuXing = wuXing;
    }

    public String getWuXingDesc() {
        return wuXingDesc;
    }

    public void setWuXingDesc(String wuXingDesc) {
        this.wuXingDesc = wuXingDesc;
    }

    @Override
    public String toString() {
        return solarDay + " " + time + "\n" + weekday + "\n" + constellation + "\n\n" + lunarYear + lunarDay + "\n"
                + period + "\n" + zodiac + "\n" + bazi + "\n" + wuXing + "\n" + wuXingDesc;
    }
}
