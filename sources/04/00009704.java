package org.godotengine.godot.utils;

import java.security.MessageDigest;
import java.util.Random;

/* loaded from: classes5.dex */
public class Crypt {
    public static long createAbsRandomLong() {
        return Math.abs(createRandomLong());
    }

    public static String createRandomHash() {
        return md5(Long.toString(createRandomLong()));
    }

    public static long createRandomLong() {
        return new Random().nextLong();
    }

    public static String md5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b11 : digest) {
                stringBuffer.append(Integer.toHexString(b11 & 255));
            }
            return stringBuffer.toString();
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }
}