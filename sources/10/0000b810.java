package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class e extends g {
    public e(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
    }

    @Override // up.g
    public String e() {
        return "mm";
    }

    @Override // up.g
    public Paint.Align l() {
        return this.f53650a.f17498p.h() ? Paint.Align.LEFT : Paint.Align.RIGHT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        int i11 = 0;
        calendar.set(12, 0);
        while (i11 < 60) {
            arrayList.add(this.f53654e.format(calendar.getTime()));
            calendar.add(12, this.f53650a.y());
            i11 += this.f53650a.y();
        }
        return arrayList;
    }

    @Override // up.g
    public boolean v() {
        return this.f53650a.z() != qp.b.date;
    }

    @Override // up.g
    public boolean w() {
        return true;
    }
}