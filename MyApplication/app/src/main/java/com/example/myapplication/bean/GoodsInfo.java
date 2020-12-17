package com.example.myapplication.bean;

import com.example.myapplication.R;

import java.util.ArrayList;

public class GoodsInfo {
    public long rowid; // 行号
    public int sn; // 序号
    public String name; // 名称
    public String desc2; // 描述
    public float price; // 价格
    public String thumb_path; // 小图的保存路径
    public String pic_path; // 大图的保存路径
    public int thumb; // 小图的资源编号
    public int pic; // 大图的资源编号
    public int pic_id;
    public String title;
    public boolean bPressed;
    public int id;
    private static int seq = 0;
    public String desc;
    public GoodsInfo(int pic_id, String title, String desc) {
        rowid = 0L;
        sn = 0;
        name = "";
        desc2 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
        this.pic_id = pic_id;
        this.title = title;
        this.desc = desc;
        this.bPressed = false;
        this.id = this.seq;
        this.seq++;
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

    public GoodsInfo() {
        rowid = 0L;
        sn = 0;
        name = "";
        desc2 = "";
        price = 0;
        thumb_path = "";
        pic_path = "";
        thumb = 0;
        pic = 0;
    }

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
    private static int[] gridImageArray = {R.drawable.pic_01, R.drawable.pic_02, R.drawable.pic_03
            , R.drawable.pic_04, R.drawable.pic_05, R.drawable.pic_06, R.drawable.pic_07
            , R.drawable.pic_08, R.drawable.pic_09, R.drawable.pic_10};
    private static String[] gridTitleArray = {"商场", "超市", "百货", "便利店",
            "地摊", "食杂店", "饭店", "餐厅", "会所", "菜市场"};

    public static ArrayList<GoodsInfo> getDefaultGrid() {
        ArrayList<GoodsInfo> gridArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < gridImageArray.length; i++) {
            gridArray.add(new GoodsInfo(gridImageArray[i], gridTitleArray[i], null));
        }
        return gridArray;
    }
    private static int[] stagImageArray = {R.drawable.skirt01, R.drawable.skirt02, R.drawable.skirt03
            , R.drawable.skirt04, R.drawable.skirt05, R.drawable.skirt06, R.drawable.skirt07
            , R.drawable.skirt08, R.drawable.skirt09, R.drawable.skirt10, R.drawable.skirt11
            , R.drawable.skirt12, R.drawable.skirt13, R.drawable.skirt14, R.drawable.skirt15
            , R.drawable.skirt16, R.drawable.skirt17, R.drawable.skirt18, R.drawable.skirt19
            , R.drawable.skirt20, R.drawable.skirt21, R.drawable.skirt22, R.drawable.skirt23};
    private static String[] stagTitleArray = {"促销价", "惊爆价", "跳楼价", "白菜价", "清仓价", "割肉价",
            "实惠价", "一口价", "满意价", "打折价", "腰斩价", "无人问津", "算了吧", "大声点",
            "嘘嘘", "嗯嗯", "呼呼", "呵呵", "哈哈", "嘿嘿", "嘻嘻", "嗷嗷", "喔喔"};

    public static ArrayList<GoodsInfo> getDefaultStag() {

        ArrayList<GoodsInfo> stagArray = new ArrayList<GoodsInfo>();
        for (int i = 0; i < stagImageArray.length; i++) {
            stagArray.add(new GoodsInfo(stagImageArray[i], stagTitleArray[i], null));
        }
        return stagArray;
    }
}
