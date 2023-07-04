package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import expo.modules.imagepicker.ImagePickerConstants;
import java.io.ByteArrayInputStream;

/* loaded from: classes3.dex */
public class m extends e0 {
    public m(pd.g gVar) {
        super(kd.a.a(), gVar);
    }

    static byte[] g(String str) {
        md.k.b(Boolean.valueOf(str.substring(0, 5).equals("data:")));
        int indexOf = str.indexOf(44);
        String substring = str.substring(indexOf + 1, str.length());
        if (h(str.substring(0, indexOf))) {
            return Base64.decode(substring, 0);
        }
        String decode = Uri.decode(substring);
        md.k.g(decode);
        return decode.getBytes();
    }

    static boolean h(String str) {
        if (str.contains(";")) {
            String[] split = str.split(";");
            return split[split.length - 1].equals(ImagePickerConstants.OPTION_BASE64);
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        byte[] g11 = g(aVar.s().toString());
        return c(new ByteArrayInputStream(g11), g11.length);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "DataFetchProducer";
    }
}