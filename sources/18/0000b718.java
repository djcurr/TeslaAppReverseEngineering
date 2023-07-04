package u4;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.t0;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import v4.j;

/* loaded from: classes.dex */
public class c {
    public static CancellationSignal a() {
        if (Build.VERSION.SDK_INT >= 16) {
            return v4.b.b();
        }
        return null;
    }

    public static void b(v4.g gVar) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor a12 = gVar.a1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (a12.moveToNext()) {
            try {
                arrayList.add(a12.getString(0));
            } catch (Throwable th2) {
                a12.close();
                throw th2;
            }
        }
        a12.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                gVar.u("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor c(t0 t0Var, j jVar, boolean z11, CancellationSignal cancellationSignal) {
        Cursor query = t0Var.query(jVar, cancellationSignal);
        if (z11 && (query instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
            int count = abstractWindowedCursor.getCount();
            return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? b.a(abstractWindowedCursor) : query;
        }
        return query;
    }

    public static int d(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i11 = allocate.getInt();
                channel.close();
                return i11;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th2) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th2;
        }
    }
}