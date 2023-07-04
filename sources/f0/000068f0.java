package expo.modules.contacts;

import android.content.ContentProviderOperation;
import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import java.io.ByteArrayOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes5.dex */
public class Contact {
    protected String contactId;
    protected String displayName;
    protected String lookupKey;
    protected String note;
    protected String photoUri;
    protected String rawContactId;
    protected String rawPhotoUri;
    protected boolean isMe = false;
    protected boolean hasPhoto = false;
    protected String contactType = "person";
    protected String firstName = "";
    protected String middleName = "";
    protected String lastName = "";
    protected String prefix = "";
    protected String suffix = "";
    protected String phoneticFirstName = "";
    protected String phoneticMiddleName = "";
    protected String phoneticLastName = "";
    protected String company = "";
    protected String department = "";
    protected String jobTitle = "";
    protected List<BaseModel> dates = new ArrayList();
    protected List<BaseModel> emails = new ArrayList();
    protected List<BaseModel> imAddresses = new ArrayList();
    protected List<BaseModel> phones = new ArrayList();
    protected List<BaseModel> addresses = new ArrayList();
    protected List<BaseModel> relationships = new ArrayList();
    protected List<BaseModel> urlAddresses = new ArrayList();
    protected List<BaseModel> extraNames = new ArrayList();

    public Contact(String str) {
        this.contactId = str;
    }

    private Bitmap getThumbnailBitmap(String str) {
        return BitmapFactory.decodeFile(Uri.parse(str).getPath());
    }

    public void fromCursor(Cursor cursor) {
        this.rawContactId = cursor.getString(cursor.getColumnIndex("raw_contact_id"));
        String string = cursor.getString(cursor.getColumnIndex(EXColumns.MIMETYPE));
        String string2 = cursor.getString(cursor.getColumnIndex(EXColumns.DISPLAY_NAME));
        if (!TextUtils.isEmpty(string2) && TextUtils.isEmpty(this.displayName)) {
            this.displayName = string2;
        }
        boolean z11 = true;
        if (TextUtils.isEmpty(this.rawPhotoUri)) {
            String string3 = cursor.getString(cursor.getColumnIndex(EXColumns.PHOTO_URI));
            if (!TextUtils.isEmpty(string3)) {
                this.hasPhoto = true;
                this.rawPhotoUri = string3;
            }
        }
        if (TextUtils.isEmpty(this.photoUri)) {
            String string4 = cursor.getString(cursor.getColumnIndex(EXColumns.PHOTO_THUMBNAIL_URI));
            if (!TextUtils.isEmpty(string4)) {
                this.hasPhoto = true;
                this.photoUri = string4;
            }
        }
        if (string.equals("vnd.android.cursor.item/name")) {
            this.lookupKey = cursor.getString(cursor.getColumnIndex(EXColumns.LOOKUP_KEY));
            this.firstName = cursor.getString(cursor.getColumnIndex(EXColumns.TYPE));
            this.middleName = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_5));
            this.lastName = cursor.getString(cursor.getColumnIndex(EXColumns.LABEL));
            this.prefix = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_4));
            this.suffix = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_6));
            this.phoneticFirstName = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_7));
            this.phoneticMiddleName = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_8));
            this.phoneticLastName = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_9));
        } else if (string.equals("vnd.android.cursor.item/organization")) {
            this.company = cursor.getString(cursor.getColumnIndex(EXColumns.DATA));
            this.jobTitle = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_4));
            this.department = cursor.getString(cursor.getColumnIndex(EXColumns.DATA_5));
        } else if (string.equals("vnd.android.cursor.item/note")) {
            this.note = cursor.getString(cursor.getColumnIndex(EXColumns.DATA));
        } else if (string.equals("vnd.android.cursor.item/contact_event")) {
            DateModel dateModel = new DateModel();
            dateModel.fromCursor(cursor);
            this.dates.add(dateModel);
        } else if (string.equals("vnd.android.cursor.item/email_v2")) {
            EmailModel emailModel = new EmailModel();
            emailModel.fromCursor(cursor);
            this.emails.add(emailModel);
        } else if (string.equals("vnd.android.cursor.item/im")) {
            ImAddressModel imAddressModel = new ImAddressModel();
            imAddressModel.fromCursor(cursor);
            this.imAddresses.add(imAddressModel);
        } else if (string.equals("vnd.android.cursor.item/phone_v2")) {
            PhoneNumberModel phoneNumberModel = new PhoneNumberModel();
            phoneNumberModel.fromCursor(cursor);
            this.phones.add(phoneNumberModel);
        } else if (string.equals("vnd.android.cursor.item/postal-address_v2")) {
            PostalAddressModel postalAddressModel = new PostalAddressModel();
            postalAddressModel.fromCursor(cursor);
            this.addresses.add(postalAddressModel);
        } else if (string.equals("vnd.android.cursor.item/relation")) {
            RelationshipModel relationshipModel = new RelationshipModel();
            relationshipModel.fromCursor(cursor);
            this.relationships.add(relationshipModel);
        } else if (string.equals("vnd.android.cursor.item/website")) {
            UrlAddressModel urlAddressModel = new UrlAddressModel();
            urlAddressModel.fromCursor(cursor);
            this.urlAddresses.add(urlAddressModel);
        } else if (string.equals("vnd.android.cursor.item/nickname")) {
            ExtraNameModel extraNameModel = new ExtraNameModel();
            extraNameModel.fromCursor(cursor);
            this.extraNames.add(extraNameModel);
        }
        String str = this.company;
        if ((str == null || str.equals("")) ? false : true) {
            String str2 = this.firstName;
            boolean z12 = (str2 == null || str2.equals("")) ? false : true;
            String str3 = this.middleName;
            boolean z13 = (str3 == null || str3.equals("")) ? false : true;
            String str4 = this.lastName;
            if (str4 == null || str4.equals("")) {
                z11 = false;
            }
            if (!z12 && !z13 && !z11) {
                this.contactType = "company";
                return;
            } else {
                this.contactType = "person";
                return;
            }
        }
        this.contactType = "person";
    }

    List[] getBaseModels() {
        return new List[]{this.dates, this.emails, this.imAddresses, this.phones, this.addresses, this.relationships, this.urlAddresses, this.extraNames};
    }

    public ArrayList<ContentValues> getContentValues() {
        List[] baseModels;
        Bitmap thumbnailBitmap;
        Bitmap thumbnailBitmap2;
        ArrayList<ContentValues> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        contentValues.put(EXColumns.MIMETYPE, "vnd.android.cursor.item/identity");
        contentValues.put(EXColumns.TYPE, this.firstName);
        contentValues.put(EXColumns.DATA_5, this.middleName);
        contentValues.put(EXColumns.LABEL, this.lastName);
        contentValues.put(EXColumns.DATA_4, this.prefix);
        contentValues.put(EXColumns.DATA_6, this.suffix);
        contentValues.put(EXColumns.DATA_7, this.phoneticFirstName);
        contentValues.put(EXColumns.DATA_8, this.phoneticMiddleName);
        contentValues.put(EXColumns.DATA_9, this.phoneticLastName);
        arrayList.add(contentValues);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(EXColumns.MIMETYPE, "vnd.android.cursor.item/organization");
        contentValues2.put(EXColumns.DATA, this.company);
        contentValues2.put(EXColumns.DATA_4, this.jobTitle);
        contentValues2.put(EXColumns.DATA_5, this.department);
        arrayList.add(contentValues2);
        ContentValues contentValues3 = new ContentValues();
        contentValues3.put(EXColumns.MIMETYPE, "vnd.android.cursor.item/note");
        contentValues3.put(EXColumns.DATA, this.note);
        arrayList.add(contentValues3);
        String str = this.photoUri;
        if (str != null && !str.isEmpty() && (thumbnailBitmap2 = getThumbnailBitmap(Uri.parse(this.photoUri).getPath())) != null) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put(EXColumns.MIMETYPE, "vnd.android.cursor.item/photo");
            contentValues4.put("data15", toByteArray(thumbnailBitmap2));
            arrayList.add(contentValues4);
        }
        String str2 = this.rawPhotoUri;
        if (str2 != null && !str2.isEmpty() && (thumbnailBitmap = getThumbnailBitmap(this.rawPhotoUri)) != null) {
            ContentValues contentValues5 = new ContentValues();
            contentValues5.put(EXColumns.MIMETYPE, "vnd.android.cursor.item/photo");
            contentValues5.put("data15", toByteArray(thumbnailBitmap));
            arrayList.add(contentValues5);
        }
        for (List<BaseModel> list : getBaseModels()) {
            if (list != null) {
                for (BaseModel baseModel : list) {
                    arrayList.add(baseModel.getContentValues());
                }
            }
        }
        return arrayList;
    }

    public String getDisplayName() {
        String str;
        String str2 = this.displayName;
        if (str2 != null || (str = this.firstName) == null) {
            return str2;
        }
        String str3 = this.lastName;
        return str3 == null ? str : String.format("%s %s", str, str3).trim();
    }

    public String getFirstName() {
        String str = this.firstName;
        if (str == null) {
            String str2 = this.displayName;
            return str2 == null ? "" : str2;
        }
        return str;
    }

    public String getLastName() {
        String str = this.lastName;
        if (str == null) {
            String str2 = this.displayName;
            return str2 == null ? "" : str2;
        }
        return str;
    }

    public byte[] toByteArray(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 80, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public ArrayList<ContentProviderOperation> toInsertOperationList() {
        List[] baseModels;
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", null).withValue("account_name", null).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(EXColumns.MIMETYPE, "vnd.android.cursor.item/name").withValue(EXColumns.DATA, this.displayName).withValue(EXColumns.TYPE, this.firstName).withValue(EXColumns.DATA_5, this.middleName).withValue(EXColumns.LABEL, this.lastName).withValue(EXColumns.DATA_7, this.phoneticFirstName).withValue(EXColumns.DATA_8, this.phoneticMiddleName).withValue(EXColumns.DATA_9, this.phoneticLastName).withValue(EXColumns.DATA_4, this.prefix).withValue(EXColumns.DATA_6, this.suffix).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(EXColumns.MIMETYPE, "vnd.android.cursor.item/organization").withValue(EXColumns.DATA, this.company).withValue(EXColumns.DATA_4, this.jobTitle).withValue(EXColumns.DATA_5, this.department).build());
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(EXColumns.MIMETYPE, "vnd.android.cursor.item/note").withValue(EXColumns.DATA, this.note);
        arrayList.add(withValue.build());
        withValue.withYieldAllowed(true);
        if (!TextUtils.isEmpty(this.photoUri) || !TextUtils.isEmpty(this.rawPhotoUri)) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(TextUtils.isEmpty(this.rawPhotoUri) ? this.photoUri : this.rawPhotoUri);
            if (thumbnailBitmap != null) {
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue(EXColumns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(thumbnailBitmap)).build());
            }
        }
        for (List<BaseModel> list : getBaseModels()) {
            if (list != null) {
                for (BaseModel baseModel : list) {
                    arrayList.add(baseModel.getInsertOperation());
                }
            }
        }
        return arrayList;
    }

    public Bundle toMap(Set<String> set) {
        Bundle bundle = new Bundle();
        bundle.putString("lookupKey", this.lookupKey);
        bundle.putString("id", this.contactId);
        bundle.putString("name", TextUtils.isEmpty(this.displayName) ? this.firstName + " " + this.lastName : this.displayName);
        if (!TextUtils.isEmpty(this.firstName)) {
            bundle.putString("firstName", this.firstName);
        }
        if (!TextUtils.isEmpty(this.middleName)) {
            bundle.putString("middleName", this.middleName);
        }
        if (!TextUtils.isEmpty(this.lastName)) {
            bundle.putString("lastName", this.lastName);
        }
        if (!TextUtils.isEmpty(this.suffix)) {
            bundle.putString("nameSuffix", this.suffix);
        }
        if (!TextUtils.isEmpty(this.prefix)) {
            bundle.putString("namePrefix", this.prefix);
        }
        if (!TextUtils.isEmpty(this.phoneticFirstName)) {
            bundle.putString("phoneticFirstName", this.phoneticFirstName);
        }
        if (!TextUtils.isEmpty(this.phoneticLastName)) {
            bundle.putString("phoneticLastName", this.phoneticLastName);
        }
        if (!TextUtils.isEmpty(this.phoneticMiddleName)) {
            bundle.putString("phoneticMiddleName", this.phoneticMiddleName);
        }
        bundle.putString("contactType", this.contactType);
        if (!TextUtils.isEmpty(this.company)) {
            bundle.putString("company", this.company);
        }
        if (!TextUtils.isEmpty(this.jobTitle)) {
            bundle.putString("jobTitle", this.jobTitle);
        }
        if (!TextUtils.isEmpty(this.department)) {
            bundle.putString("department", this.department);
        }
        bundle.putBoolean("imageAvailable", this.hasPhoto);
        if (set.contains("image") && this.photoUri != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("uri", this.photoUri);
            bundle.putBundle("image", bundle2);
        }
        if (set.contains("rawImage") && this.rawPhotoUri != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("uri", this.rawPhotoUri);
            bundle.putBundle("image", bundle3);
        }
        if (set.contains("note") && !TextUtils.isEmpty(this.note)) {
            bundle.putString("note", this.note);
        }
        if (set.contains("phoneNumbers") && this.phones.size() > 0) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (BaseModel baseModel : this.phones) {
                arrayList.add(baseModel.getMap());
            }
            bundle.putParcelableArrayList("phoneNumbers", arrayList);
        }
        if (set.contains("emails") && this.emails.size() > 0) {
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            for (BaseModel baseModel2 : this.emails) {
                arrayList2.add(baseModel2.getMap());
            }
            bundle.putParcelableArrayList("emails", arrayList2);
        }
        if (set.contains("addresses") && this.addresses.size() > 0) {
            ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
            for (BaseModel baseModel3 : this.addresses) {
                arrayList3.add(baseModel3.getMap());
            }
            bundle.putParcelableArrayList("addresses", arrayList3);
        }
        if (set.contains("instantMessageAddresses") && this.imAddresses.size() > 0) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>();
            for (BaseModel baseModel4 : this.imAddresses) {
                arrayList4.add(baseModel4.getMap());
            }
            bundle.putParcelableArrayList("instantMessageAddresses", arrayList4);
        }
        if (set.contains("urlAddresses") && this.urlAddresses.size() > 0) {
            ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
            for (BaseModel baseModel5 : this.urlAddresses) {
                arrayList5.add(baseModel5.getMap());
            }
            bundle.putParcelableArrayList("urlAddresses", arrayList5);
        }
        if (set.contains("relationships") && this.relationships.size() > 0) {
            ArrayList<? extends Parcelable> arrayList6 = new ArrayList<>();
            for (BaseModel baseModel6 : this.relationships) {
                arrayList6.add(baseModel6.getMap());
            }
            bundle.putParcelableArrayList("relationships", arrayList6);
        }
        if (this.extraNames.size() > 0) {
            boolean contains = set.contains("nickname");
            boolean contains2 = set.contains("maidenName");
            for (int i11 = 0; i11 < this.extraNames.size(); i11++) {
                ExtraNameModel extraNameModel = (ExtraNameModel) this.extraNames.get(i11);
                String data = extraNameModel.getData();
                String label = extraNameModel.getLabel();
                if (contains2 && label != null && label.equals("maidenName") && !TextUtils.isEmpty(data)) {
                    bundle.putString(label, data);
                }
                if (contains && label != null && label.equals("nickname") && !TextUtils.isEmpty(data)) {
                    bundle.putString(label, data);
                }
            }
        }
        boolean contains3 = set.contains("birthday");
        boolean contains4 = set.contains("dates");
        if (contains4 || contains3) {
            ArrayList<? extends Parcelable> arrayList7 = new ArrayList<>();
            ArrayList<? extends Parcelable> arrayList8 = new ArrayList<>();
            for (BaseModel baseModel7 : this.dates) {
                Calendar calendar = Calendar.getInstance();
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("--MM-dd", Locale.getDefault());
                Bundle bundle4 = new Bundle();
                String data2 = baseModel7.getData();
                String label2 = baseModel7.getLabel();
                Bundle bundle5 = new Bundle();
                bundle5.putString("type", label2);
                bundle5.putString("value", data2);
                arrayList7.add(bundle5);
                try {
                    boolean z11 = !data2.startsWith("--");
                    if (z11) {
                        calendar.setTime(simpleDateFormat.parse(data2));
                    } else {
                        calendar.setTime(simpleDateFormat2.parse(data2));
                    }
                    if (z11) {
                        bundle4.putInt("year", calendar.get(1));
                    }
                    bundle4.putInt("month", calendar.get(2));
                    bundle4.putInt("day", calendar.get(5));
                    bundle4.putString("format", "gregorian");
                    if (contains3 && label2 != null && label2.equals("birthday")) {
                        bundle.putBundle("birthday", bundle4);
                    } else {
                        bundle4.putString("label", label2);
                        arrayList8.add(bundle4);
                    }
                } catch (Exception e11) {
                    Log.w("Contact", e11.toString());
                }
            }
            if (contains4 && arrayList8.size() > 0) {
                bundle.putParcelableArrayList("dates", arrayList8);
            }
            if (arrayList7.size() > 0) {
                bundle.putParcelableArrayList("rawDates", arrayList7);
            }
        }
        return bundle;
    }

    public ArrayList<ContentProviderOperation> toUpdateOperationList() {
        List[] baseModels;
        String format = String.format("%s=? AND %s=?", EXColumns.CONTACT_ID, EXColumns.MIMETYPE);
        String[] strArr = {this.contactId, "vnd.android.cursor.item/name"};
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(format, strArr).withValue(EXColumns.DATA, this.displayName).withValue(EXColumns.TYPE, this.firstName).withValue(EXColumns.DATA_5, this.middleName).withValue(EXColumns.LABEL, this.lastName).withValue(EXColumns.DATA_7, this.phoneticFirstName).withValue(EXColumns.DATA_8, this.phoneticMiddleName).withValue(EXColumns.DATA_9, this.phoneticLastName).withValue(EXColumns.DATA_4, this.prefix).withValue(EXColumns.DATA_6, this.suffix).build());
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(format, strArr).withValue(EXColumns.DATA, this.company).withValue(EXColumns.DATA_4, this.jobTitle).withValue(EXColumns.DATA_5, this.department).build());
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection(format, new String[]{this.contactId, "vnd.android.cursor.item/note"}).withValue(EXColumns.DATA, this.note);
        arrayList.add(withValue.build());
        withValue.withYieldAllowed(true);
        if (!TextUtils.isEmpty(this.photoUri) || !TextUtils.isEmpty(this.rawPhotoUri)) {
            Bitmap thumbnailBitmap = getThumbnailBitmap(TextUtils.isEmpty(this.rawPhotoUri) ? this.photoUri : this.rawPhotoUri);
            if (thumbnailBitmap != null) {
                arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection(format, new String[]{this.rawContactId, "vnd.android.cursor.item/photo"}).build());
                arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", this.rawContactId).withValue(EXColumns.MIMETYPE, "vnd.android.cursor.item/photo").withValue("data15", toByteArray(thumbnailBitmap)).build());
            }
        }
        for (List<BaseModel> list : getBaseModels()) {
            if (list != null) {
                for (BaseModel baseModel : list) {
                    arrayList.add(baseModel.getDeleteOperation(this.rawContactId));
                    arrayList.add(baseModel.getInsertOperation(this.rawContactId));
                }
            }
        }
        return arrayList;
    }
}