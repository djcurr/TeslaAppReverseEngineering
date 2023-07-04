package com.reactnativedocumentpicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@fg.a(name = DocumentPickerModule.NAME)
/* loaded from: classes2.dex */
public class DocumentPickerModule extends ReactContextBaseJavaModule {
    private static final String E_ACTIVITY_DOES_NOT_EXIST = "ACTIVITY_DOES_NOT_EXIST";
    private static final String E_DOCUMENT_PICKER_CANCELED = "DOCUMENT_PICKER_CANCELED";
    private static final String E_FAILED_TO_SHOW_PICKER = "FAILED_TO_SHOW_PICKER";
    private static final String E_INVALID_DATA_RETURNED = "INVALID_DATA_RETURNED";
    private static final String E_UNABLE_TO_OPEN_FILE_TYPE = "UNABLE_TO_OPEN_FILE_TYPE";
    private static final String E_UNEXPECTED_EXCEPTION = "UNEXPECTED_EXCEPTION";
    private static final String E_UNKNOWN_ACTIVITY_RESULT = "UNKNOWN_ACTIVITY_RESULT";
    private static final String FIELD_COPY_ERROR = "copyError";
    private static final String FIELD_FILE_COPY_URI = "fileCopyUri";
    private static final String FIELD_NAME = "name";
    private static final String FIELD_SIZE = "size";
    private static final String FIELD_TYPE = "type";
    private static final String FIELD_URI = "uri";
    public static final String NAME = "RNDocumentPicker";
    private static final String OPTION_COPY_TO = "copyTo";
    private static final String OPTION_MULTIPLE = "allowMultiSelection";
    private static final String OPTION_TYPE = "type";
    private static final int PICK_DIR_REQUEST_CODE = 42;
    private static final int READ_REQUEST_CODE = 41;
    private final ActivityEventListener activityEventListener;
    private String copyTo;
    private Promise promise;

    /* loaded from: classes2.dex */
    class a extends BaseActivityEventListener {
        a() {
        }

        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            Promise promise = DocumentPickerModule.this.promise;
            if (promise == null) {
                Log.e(DocumentPickerModule.NAME, "promise was null in onActivityResult");
            } else if (i11 == 41) {
                DocumentPickerModule.this.onShowActivityResult(i12, intent, promise);
            } else if (i11 == 42) {
                DocumentPickerModule.this.onPickDirectoryResult(i12, intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class b extends GuardedResultAsyncTask<ReadableArray> {

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<Context> f20195a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Uri> f20196b;

        /* renamed from: c  reason: collision with root package name */
        private final String f20197c;

        /* renamed from: d  reason: collision with root package name */
        private final Promise f20198d;

        protected b(ReactContext reactContext, List<Uri> list, String str, Promise promise) {
            super(reactContext.getExceptionHandler());
            this.f20195a = new WeakReference<>(reactContext.getApplicationContext());
            this.f20196b = list;
            this.f20197c = str;
            this.f20198d = promise;
        }

        public static String a(Context context, Uri uri, File file) {
            FileOutputStream fileOutputStream;
            InputStream inputStream = null;
            try {
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                try {
                    if (openInputStream != null) {
                        fileOutputStream = new FileOutputStream(file);
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int read = openInputStream.read(bArr);
                                if (read > 0) {
                                    fileOutputStream.write(bArr, 0, read);
                                } else {
                                    fileOutputStream.close();
                                    openInputStream.close();
                                    return file.toURI().toString();
                                }
                            }
                        } catch (Exception e11) {
                            e = e11;
                            inputStream = openInputStream;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException unused) {
                                    throw e;
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw e;
                        }
                    } else {
                        throw new NullPointerException("Invalid input stream");
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream = null;
                }
            } catch (Exception e13) {
                e = e13;
                fileOutputStream = null;
            }
        }

        private WritableMap c(Uri uri) {
            Context context = this.f20195a.get();
            if (context == null) {
                return Arguments.createMap();
            }
            ContentResolver contentResolver = context.getContentResolver();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(DocumentPickerModule.FIELD_URI, uri.toString());
            createMap.putString("type", contentResolver.getType(uri));
            Cursor query = contentResolver.query(uri, null, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        int columnIndex = query.getColumnIndex("_display_name");
                        if (!query.isNull(columnIndex)) {
                            createMap.putString("name", query.getString(columnIndex));
                        }
                        int columnIndex2 = query.getColumnIndex("mime_type");
                        if (!query.isNull(columnIndex2)) {
                            createMap.putString("type", query.getString(columnIndex2));
                        }
                        int columnIndex3 = query.getColumnIndex("_size");
                        if (!query.isNull(columnIndex3)) {
                            createMap.putInt(DocumentPickerModule.FIELD_SIZE, query.getInt(columnIndex3));
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        query.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            if (query != null) {
                query.close();
            }
            e(context, createMap, uri);
            return createMap;
        }

        private void e(Context context, WritableMap writableMap, Uri uri) {
            if (this.f20197c != null) {
                File cacheDir = context.getCacheDir();
                if (this.f20197c.equals("documentDirectory")) {
                    cacheDir = context.getFilesDir();
                }
                File file = new File(cacheDir, UUID.randomUUID().toString());
                try {
                    if (file.mkdir()) {
                        String string = writableMap.getString("name");
                        if (string == null) {
                            string = String.valueOf(System.currentTimeMillis());
                        }
                        writableMap.putString(DocumentPickerModule.FIELD_FILE_COPY_URI, a(context, uri, new File(file, string)));
                        return;
                    }
                    throw new IOException("failed to create directory at " + file.getAbsolutePath());
                } catch (Exception e11) {
                    e11.printStackTrace();
                    writableMap.putNull(DocumentPickerModule.FIELD_FILE_COPY_URI);
                    writableMap.putString(DocumentPickerModule.FIELD_COPY_ERROR, e11.getLocalizedMessage());
                    return;
                }
            }
            writableMap.putNull(DocumentPickerModule.FIELD_FILE_COPY_URI);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* renamed from: b */
        public ReadableArray doInBackgroundGuarded() {
            WritableArray createArray = Arguments.createArray();
            for (Uri uri : this.f20196b) {
                createArray.pushMap(c(uri));
            }
            return createArray;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* renamed from: d */
        public void onPostExecuteGuarded(ReadableArray readableArray) {
            this.f20198d.resolve(readableArray);
        }
    }

    public DocumentPickerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        a aVar = new a();
        this.activityEventListener = aVar;
        reactApplicationContext.addActivityEventListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPickDirectoryResult(int i11, Intent intent) {
        if (i11 == 0) {
            sendError(E_DOCUMENT_PICKER_CANCELED, "User canceled directory picker");
        } else if (i11 != -1) {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i11);
        } else if (intent != null && intent.getData() != null) {
            Uri data = intent.getData();
            WritableMap createMap = Arguments.createMap();
            createMap.putString(FIELD_URI, data.toString());
            this.promise.resolve(createMap);
        } else {
            sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
        }
    }

    private String[] readableArrayToStringArray(ReadableArray readableArray) {
        int size = readableArray.size();
        String[] strArr = new String[size];
        for (int i11 = 0; i11 < size; i11++) {
            strArr[i11] = readableArray.getString(i11);
        }
        return strArr;
    }

    private void sendError(String str, String str2) {
        sendError(str, str2, null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeActivityEventListener(this.activityEventListener);
    }

    public void onShowActivityResult(int i11, Intent intent, Promise promise) {
        Uri uri;
        if (i11 == 0) {
            sendError(E_DOCUMENT_PICKER_CANCELED, "User canceled document picker");
        } else if (i11 == -1) {
            ClipData clipData = null;
            if (intent != null) {
                Uri data = intent.getData();
                ClipData clipData2 = intent.getClipData();
                uri = data;
                clipData = clipData2;
            } else {
                uri = null;
            }
            try {
                ArrayList arrayList = new ArrayList();
                if (clipData != null && clipData.getItemCount() > 0) {
                    int itemCount = clipData.getItemCount();
                    for (int i12 = 0; i12 < itemCount; i12++) {
                        arrayList.add(clipData.getItemAt(i12).getUri());
                    }
                } else if (uri != null) {
                    arrayList.add(uri);
                } else {
                    sendError(E_INVALID_DATA_RETURNED, "Invalid data returned by intent");
                    return;
                }
                new b(getReactApplicationContext(), arrayList, this.copyTo, promise).execute(new Void[0]);
            } catch (Exception e11) {
                sendError(E_UNEXPECTED_EXCEPTION, e11.getLocalizedMessage(), e11);
            }
        } else {
            sendError(E_UNKNOWN_ACTIVITY_RESULT, "Unknown activity result: " + i11);
        }
    }

    @ReactMethod
    public void pick(ReadableMap readableMap, Promise promise) {
        ReadableArray array;
        Activity currentActivity = getCurrentActivity();
        this.promise = promise;
        this.copyTo = readableMap.hasKey(OPTION_COPY_TO) ? readableMap.getString(OPTION_COPY_TO) : null;
        if (currentActivity == null) {
            sendError(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.addCategory("android.intent.category.OPENABLE");
            intent.setType("*/*");
            boolean z11 = false;
            if (!readableMap.isNull("type") && (array = readableMap.getArray("type")) != null) {
                if (array.size() > 1) {
                    String[] readableArrayToStringArray = readableArrayToStringArray(array);
                    intent.putExtra("android.intent.extra.MIME_TYPES", readableArrayToStringArray);
                    intent.setType(com.reactnativedocumentpicker.a.a("|", readableArrayToStringArray));
                } else if (array.size() == 1) {
                    intent.setType(array.getString(0));
                }
            }
            if (!readableMap.isNull(OPTION_MULTIPLE) && readableMap.getBoolean(OPTION_MULTIPLE)) {
                z11 = true;
            }
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", z11);
            currentActivity.startActivityForResult(Intent.createChooser(intent, null), 41, Bundle.EMPTY);
        } catch (ActivityNotFoundException e11) {
            sendError(E_UNABLE_TO_OPEN_FILE_TYPE, e11.getLocalizedMessage());
        } catch (Exception e12) {
            e12.printStackTrace();
            sendError(E_FAILED_TO_SHOW_PICKER, e12.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void pickDirectory(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject(E_ACTIVITY_DOES_NOT_EXIST, "Current activity does not exist");
            return;
        }
        this.promise = promise;
        try {
            currentActivity.startActivityForResult(new Intent("android.intent.action.OPEN_DOCUMENT_TREE"), 42, null);
        } catch (Exception e11) {
            sendError(E_FAILED_TO_SHOW_PICKER, "Failed to create directory picker", e11);
        }
    }

    private void sendError(String str, String str2, Exception exc) {
        Promise promise = this.promise;
        if (promise != null) {
            this.promise = null;
            promise.reject(str, str2, exc);
        }
    }
}