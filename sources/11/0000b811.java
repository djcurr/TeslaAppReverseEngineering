package up;

import android.graphics.Paint;
import com.henninghall.date_picker.j;
import java.util.ArrayList;
import java.util.Calendar;

/* loaded from: classes2.dex */
public class f extends g {
    public f(com.henninghall.date_picker.pickers.a aVar, j jVar) {
        super(aVar, jVar);
    }

    @Override // up.g
    public String e() {
        return "LLLL";
    }

    @Override // up.g
    public int f() {
        return 1;
    }

    @Override // up.g
    public Paint.Align l() {
        return Paint.Align.LEFT;
    }

    @Override // up.g
    public ArrayList<String> o() {
        ArrayList<String> arrayList = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(2, 0);
        for (int i11 = 0; i11 <= 11; i11++) {
            arrayList.add(i(calendar));
            calendar.add(2, 1);
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