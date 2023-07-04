package xn;

import android.content.Context;
import com.google.android.gms.maps.GoogleMap;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes2.dex */
public class f extends vn.d {
    public f(GoogleMap googleMap, InputStream inputStream, Context context) {
        if (inputStream != null) {
            m mVar = new m(googleMap, context);
            i iVar = new i(e(inputStream));
            iVar.f();
            inputStream.close();
            mVar.j0(iVar.e(), iVar.d(), iVar.c(), iVar.a(), iVar.b());
            c(mVar);
            return;
        }
        throw new IllegalArgumentException("KML InputStream cannot be null");
    }

    private static XmlPullParser e(InputStream inputStream) {
        XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
        newInstance.setNamespaceAware(true);
        XmlPullParser newPullParser = newInstance.newPullParser();
        newPullParser.setInput(inputStream, null);
        return newPullParser;
    }

    @Override // vn.d
    public Iterable<b> b() {
        return super.b();
    }

    public void d() {
        super.a();
    }
}