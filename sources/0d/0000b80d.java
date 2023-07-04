package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class b extends g {
    public b(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
    }

    @Override // up.g
    public String e() {
        return com.henninghall.date_picker.f.a(this.f53650a.v());
    }

    @Override // up.g
    public Paint.Align l() {
        return Paint.Align.RIGHT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        Calendar calendar = Calendar.getInstance();
        ArrayList<String> arrayList = new ArrayList<>();
        calendar.set(2, 0);
        calendar.set(5, 1);
        for (int i11 = 1; i11 <= 31; i11++) {
            arrayList.add(i(calendar));
            calendar.add(5, 1);
        }
        return arrayList;
    }

    @Override // up.g
    public boolean v() {
        return this.f53650a.z() == qp.b.date;
    }

    @Override // up.g
    public boolean w() {
        return true;
    }
}