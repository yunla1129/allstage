package com.woniu.onestage.tostring0821;

/**
 * WrapperDemo
 */
public class WrapperDemo {

	
    public static void main(String[] args) {

        // //瀹氫箟鍩烘湰绫诲瀷
        // int i = 10;
        // //鏂瑰紡涓�锛氶�氳繃鍖呰绫绘瀯閫犲櫒瀹炵幇瑁呯
        // Integer t = new Integer(i); //灏嗗熀鏈被鍨嬪皝瑁呬负瀵硅薄绫诲瀷 --- 瑁呯
        // System.out.println(t);
        // //鏂瑰紡浜�: 閫氳繃瀛楃涓插弬鏁版瀯閫犲櫒瀹炵幇
        // Integer t2 = new Integer("20");
        // System.out.println(t2);

        // boolean falgValue = false;
        // Boolean flagObj = new Boolean(falgValue);
        // System.out.println(flagObj);

        // double dValue = 2.0;
        // Double dObj = dValue; //1.5涔嬪悗鑷姩瑁呯
        // System.out.println(dObj);

        // //
        // String str = "1";
        // Float fObj = new Float(str);
        // System.out.println(fObj);

        // Boolean bObj = new Boolean("true");
        // System.out.println(bObj);

        // int i = Integer.parseInt("123");
        // System.out.println(i);
        // double d = Double.parseDouble("123");
        // System.out.println(d);
        // boolean b = Boolean.parseBoolean("true");
        // System.out.println(b);

        // String str = String.valueOf(10);
        // System.out.println(str);

        // String str2 = String.valueOf(true);
        // System.out.println(str2);

        // String str3 = String.valueOf(2.34f);
        // System.out.println(str3);

        // int i = 10;
        // String str4 = i + "";
        // System.out.println(str4);

        // 娉ㄦ剰绫诲瀷涓�鑷�
        // Float f = new Float("abc"); //鎶ラ敊 --- java.lang.NumberFormatException
        // System.out.println(f);

        // //鍖呰绫� ---> 鍩烘湰绫诲瀷
        // Integer i = new Integer(10);
        // int iValue = i.intValue();
        // System.out.println(iValue);

        // Double d = new Double(2.34);
        // System.out.println(d.doubleValue());

        // Boolean b = new Boolean(true);
        // System.out.println(b.booleanValue());

        // Integer i = new Integer(30);
        // int iValue = i;
        // System.out.println(iValue);

        // // float f = 1.0; //Type mismatch: cannot convert from double to float
        // //瀵圭紪绋嬩汉鍛樻潵璇达紝double 鍜� float 鐨勫尯鍒槸double绮惧害楂橈紝鏈夋晥鏁板瓧16浣嶏紝float绮惧害7浣嶃��
        // //浣哾ouble娑堣�楀唴瀛樻槸float鐨勪袱鍊嶏紝double鐨勮繍绠楅�熷害姣攆loat鎱㈠緱澶�
        // float f = 1.8F;
        // Float fObj = f;
        // System.out.println(fObj);



        // Object o1 = true ? new Integer(1) : new Double(2.0);
        // System.out.println(o1);// 1.0

        // Object o2;
        // if (true)
        //     o2 = new Integer(1);
        // else
        //     o2 = new Double(2.0);
        // System.out.println(o2);//1

        // Integer i = new Integer(12);
        // String str = String.valueOf(i);
        // System.out.println(str);
        // Double d = new Double(20.4);
        // System.out.println(String.valueOf(d));

        // Integer i = new Integer(1);
        // Integer j = new Integer(1);
        // System.out.println(i == j); //false
        //Integer鍐呴儴瀹氫箟浜嗕竴涓狪ntegerCache鍐呴儴绫伙紝璇ョ被涓畾涔変簡涓�涓暟缁勭敤鏉ヤ繚瀛榌-128, 127]鑼冨洿鐨勬暟
        //濡傛灉浣跨敤鑷姩瑁呯鐨勬柟寮忚祴鍊硷紝鍒欎紭鍏堜娇鐢ㄦ暟缁勭紦瀛樼殑鏁版嵁锛屼笉鍐峮ew瀵硅薄銆�
        //濡傛灉瓒呰繃鍒檔ew瀵硅薄
        // Integer m = 1;
        // Integer n = 1;
        // System.out.println(m == n);//true
        // Integer x = 128;
        // Integer y = 128;
        // System.out.println(x == y);// false

        

    }
}
