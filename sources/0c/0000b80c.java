package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class a extends g {
    public a(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
    }

    @Override // up.g
    public String e() {
        return this.f53650a.f17498p.i() ? " a " : "";
    }

    @Override // up.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000, 0, 0, 0, 0, 0);
        ArrayList<String> arrayList = new ArrayList<>();
        calendar.set(11, 0);
        arrayList.add(this.f53654e.format(calendar.getTime()));
        calendar.add(11, 12);
        arrayList.add(this.f53654e.format(calendar.getTime()));
        return arrayList;
    }

    @Override // up.g
    public boolean v() {
        return this.f53650a.f17498p.i() && this.f53650a.z() != qp.b.date;
    }

    @Override // up.g
    public boolean w() {
        return false;
    }
}