package com.example.myapplication.bean;

import com.example.myapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

    // 声明一个手机商品的名称数组
    private static String[] mNameArray = {
            "iphone xs max", "iphone11", "iphone5", "iphone6", "iphone7", "iphone8","iphonese","iphonexr"
    };
    // 声明一个手机商品的描述数组
    private static String[] mDescArray = {
            "分期免息Apple/苹果 iPhone XS Max 国行苹果X双卡8x手机XR分12期",
            "【百亿抢券减250元 到手4149元起】Apple/苹果iPhone 11全网通4G手机 原装国行中国电信天翼直售苹果11Pro",
            "苹果iPhone5移动联通电信SE手机无锁4S备用机全三网通老系统6",
            " Apple/苹果 iPhone SE国行6正品6p全新6plus手机6代6..splus苹果s",
            "零售新机Apple/苹果 iPhone 7 Plus 全网通4G国行7p现货7代手机机",
            "Apple/苹果 iPhone 8 Plus全新苹果8正品国行三网苹果8plus手机8x",
            " Apple/苹果 iPhone SE (第二代) 全网国行双卡苹果XR 苹果se2手机",
            "花呗分期Apple/苹果 iPhone XR国行苹果xr全新双卡4G全网通手机X"
    };
    // 声明一个手机商品的价格数组
    private static float[] mPriceArray = {7299, 7799,500, 1000,2000, 5000,1500,5999};
    // 声明一个手机商品的小图数组
    private static int[] mThumbArray = {
            R.drawable.iphonexsmax, R.drawable.iphone11, R.drawable.iphone5,
            R.drawable.iphone6, R.drawable.iphone7, R.drawable.iphone8, R.drawable.iphonese, R.drawable.iphonexr
    };
    // 声明一个手机商品的大图数组
    private static int[] mPicArray = {
            R.drawable.iphonexsmax_s, R.drawable.iphone11_s, R.drawable.iphone5_s,
            R.drawable.iphone6_s, R.drawable.iphone7_s, R.drawable.iphone8_s,
            R.drawable.iphonese_s, R.drawable.iphonexr_s
    };

    // 获取默认的手机信息列表
    public static ArrayList<GoodsInfo> getDefaultList() {
        ArrayList<GoodsInfo> goodsList = new ArrayList<GoodsInfo>();
        for (int i = 0; i < mNameArray.length; i++) {
            GoodsInfo info = new GoodsInfo();
            info.name = mNameArray[i];
            info.desc = mDescArray[i];
            info.price = mPriceArray[i];
            info.thumb = mThumbArray[i];
            info.pic = mPicArray[i];
            goodsList.add(info);
        }
        return goodsList;
    }
}
