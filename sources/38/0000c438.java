package z3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import expo.modules.contacts.EXColumns;
import z3.b;

/* loaded from: classes.dex */
public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f60159a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f60160b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f60161c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f60162d;

    /* renamed from: e  reason: collision with root package name */
    protected int f60163e;

    /* renamed from: f  reason: collision with root package name */
    protected C1374a f60164f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f60165g;

    /* renamed from: h  reason: collision with root package name */
    protected z3.b f60166h;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z3.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C1374a extends ContentObserver {
        C1374a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z11) {
            a.this.i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends DataSetObserver {
        b() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            a aVar = a.this;
            aVar.f60159a = true;
            aVar.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            a aVar = a.this;
            aVar.f60159a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z11) {
        f(context, cursor, z11 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j11 = j(cursor);
        if (j11 != null) {
            j11.close();
        }
    }

    public abstract CharSequence b(Cursor cursor);

    @Override // z3.b.a
    public Cursor d() {
        return this.f60161c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    void f(Context context, Cursor cursor, int i11) {
        if ((i11 & 1) == 1) {
            i11 |= 2;
            this.f60160b = true;
        } else {
            this.f60160b = false;
        }
        boolean z11 = cursor != null;
        this.f60161c = cursor;
        this.f60159a = z11;
        this.f60162d = context;
        this.f60163e = z11 ? cursor.getColumnIndexOrThrow(EXColumns.ID) : -1;
        if ((i11 & 2) == 2) {
            this.f60164f = new C1374a();
            this.f60165g = new b();
        } else {
            this.f60164f = null;
            this.f60165g = null;
        }
        if (z11) {
            C1374a c1374a = this.f60164f;
            if (c1374a != null) {
                cursor.registerContentObserver(c1374a);
            }
            DataSetObserver dataSetObserver = this.f60165g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f60159a || (cursor = this.f60161c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
        if (this.f60159a) {
            this.f60161c.moveToPosition(i11);
            if (view == null) {
                view = g(this.f60162d, this.f60161c, viewGroup);
            }
            e(view, this.f60162d, this.f60161c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f60166h == null) {
            this.f60166h = new z3.b(this);
        }
        return this.f60166h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i11) {
        Cursor cursor;
        if (!this.f60159a || (cursor = this.f60161c) == null) {
            return null;
        }
        cursor.moveToPosition(i11);
        return this.f60161c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        Cursor cursor;
        if (this.f60159a && (cursor = this.f60161c) != null && cursor.moveToPosition(i11)) {
            return this.f60161c.getLong(this.f60163e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        if (this.f60159a) {
            if (this.f60161c.moveToPosition(i11)) {
                if (view == null) {
                    view = h(this.f60162d, this.f60161c, viewGroup);
                }
                e(view, this.f60162d, this.f60161c);
                return view;
            }
            throw new IllegalStateException("couldn't move cursor to position " + i11);
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    protected void i() {
        Cursor cursor;
        if (!this.f60160b || (cursor = this.f60161c) == null || cursor.isClosed()) {
            return;
        }
        this.f60159a = this.f60161c.requery();
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f60161c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C1374a c1374a = this.f60164f;
            if (c1374a != null) {
                cursor2.unregisterContentObserver(c1374a);
            }
            DataSetObserver dataSetObserver = this.f60165g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f60161c = cursor;
        if (cursor != null) {
            C1374a c1374a2 = this.f60164f;
            if (c1374a2 != null) {
                cursor.registerContentObserver(c1374a2);
            }
            DataSetObserver dataSetObserver2 = this.f60165g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f60163e = cursor.getColumnIndexOrThrow(EXColumns.ID);
            this.f60159a = true;
            notifyDataSetChanged();
        } else {
            this.f60163e = -1;
            this.f60159a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}