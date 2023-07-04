package de;

import com.google.android.gms.common.internal.ImagesContract;

/* loaded from: classes.dex */
public class d {
    public static int a(String str) {
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1917159454:
                if (str.equals("QualifiedResourceFetchProducer")) {
                    c11 = 0;
                    break;
                }
                break;
            case -1914072202:
                if (str.equals("BitmapMemoryCacheGetProducer")) {
                    c11 = 1;
                    break;
                }
                break;
            case -1683996557:
                if (str.equals("LocalResourceFetchProducer")) {
                    c11 = 2;
                    break;
                }
                break;
            case -1579985851:
                if (str.equals("LocalFileFetchProducer")) {
                    c11 = 3;
                    break;
                }
                break;
            case -1307634203:
                if (str.equals("EncodedMemoryCacheProducer")) {
                    c11 = 4;
                    break;
                }
                break;
            case -1224383234:
                if (str.equals("NetworkFetchProducer")) {
                    c11 = 5;
                    break;
                }
                break;
            case 473552259:
                if (str.equals("VideoThumbnailProducer")) {
                    c11 = 6;
                    break;
                }
                break;
            case 656304759:
                if (str.equals("DiskCacheProducer")) {
                    c11 = 7;
                    break;
                }
                break;
            case 957714404:
                if (str.equals("BitmapMemoryCacheProducer")) {
                    c11 = '\b';
                    break;
                }
                break;
            case 1019542023:
                if (str.equals("LocalAssetFetchProducer")) {
                    c11 = '\t';
                    break;
                }
                break;
            case 1023071510:
                if (str.equals("PostprocessedBitmapMemoryCacheProducer")) {
                    c11 = '\n';
                    break;
                }
                break;
            case 1721672898:
                if (str.equals("DataFetchProducer")) {
                    c11 = 11;
                    break;
                }
                break;
            case 1793127518:
                if (str.equals("LocalContentUriThumbnailFetchProducer")) {
                    c11 = '\f';
                    break;
                }
                break;
            case 2109593398:
                if (str.equals("PartialDiskCacheProducer")) {
                    c11 = '\r';
                    break;
                }
                break;
            case 2113652014:
                if (str.equals("LocalContentUriFetchProducer")) {
                    c11 = 14;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
            case 2:
            case 3:
            case 6:
            case '\t':
            case 11:
            case '\f':
            case 14:
                return 7;
            case 1:
            case '\b':
            case '\n':
                return 5;
            case 4:
                return 4;
            case 5:
                return 2;
            case 7:
            case '\r':
                return 3;
            default:
                return 1;
        }
    }

    public static String b(int i11) {
        switch (i11) {
            case 2:
                return "network";
            case 3:
                return "disk";
            case 4:
                return "memory_encoded";
            case 5:
                return "memory_bitmap";
            case 6:
                return "memory_bitmap_shortcut";
            case 7:
                return ImagesContract.LOCAL;
            default:
                return "unknown";
        }
    }
}