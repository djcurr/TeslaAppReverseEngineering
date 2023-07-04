package expo.modules.contacts;

import android.app.Activity;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.ContactsContract;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.contacts.models.BaseModel;
import expo.modules.contacts.models.DateModel;
import expo.modules.contacts.models.EmailModel;
import expo.modules.contacts.models.ExtraNameModel;
import expo.modules.contacts.models.ImAddressModel;
import expo.modules.contacts.models.PhoneNumberModel;
import expo.modules.contacts.models.PostalAddressModel;
import expo.modules.contacts.models.RelationshipModel;
import expo.modules.contacts.models.UrlAddressModel;
import expo.modules.core.ExportedModule;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityEventListener;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.ExpoMethod;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes5.dex */
public class ContactsModule extends ExportedModule {
    private static final List<String> DEFAULT_PROJECTION = new ArrayList<String>() { // from class: expo.modules.contacts.ContactsModule.1
        {
            add("raw_contact_id");
            add(EXColumns.CONTACT_ID);
            add(EXColumns.LOOKUP_KEY);
            add(EXColumns.MIMETYPE);
            add(EXColumns.DISPLAY_NAME);
            add(EXColumns.PHOTO_URI);
            add(EXColumns.PHOTO_THUMBNAIL_URI);
            add(EXColumns.DATA);
            add(EXColumns.TYPE);
            add(EXColumns.DATA_5);
            add(EXColumns.LABEL);
            add(EXColumns.DATA_4);
            add(EXColumns.DATA_6);
            add(EXColumns.DATA_7);
            add(EXColumns.DATA_8);
            add(EXColumns.DATA_9);
            add(EXColumns.DATA);
            add(EXColumns.DATA_4);
            add(EXColumns.DATA_5);
        }
    };
    public static final int RC_EDIT_CONTACT = 2137;
    private static final String TAG = "ContactsModule";
    private final ActivityEventListener mActivityEventListener;
    private ModuleRegistry mModuleRegistry;
    private Promise mPendingPromise;

    /* loaded from: classes5.dex */
    private class ContactsActivityEventListener implements ActivityEventListener {
        private ContactsActivityEventListener() {
        }

        @Override // expo.modules.core.interfaces.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            if (i11 != 2137 || ContactsModule.this.mPendingPromise == null) {
                return;
            }
            ContactsModule.this.mPendingPromise.resolve(0);
        }

        @Override // expo.modules.core.interfaces.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    public ContactsModule(Context context) {
        super(context);
        this.mActivityEventListener = new ContactsActivityEventListener();
    }

    private Set<String> convertReadableArray(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (next instanceof String) {
                hashSet.add((String) next);
            }
        }
        return hashSet;
    }

    private HashMap createProjectionForQuery(Set<String> set) {
        ArrayList arrayList = new ArrayList(DEFAULT_PROJECTION);
        ArrayList arrayList2 = new ArrayList(Arrays.asList("vnd.android.cursor.item/name", "vnd.android.cursor.item/organization"));
        String str = "mimetype=? OR mimetype=?";
        if (set.contains("phoneNumbers")) {
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.TYPE);
            arrayList.add(EXColumns.LABEL);
            arrayList.add(EXColumns.IS_PRIMARY);
            arrayList.add(EXColumns.ID);
            str = "mimetype=? OR mimetype=? OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/phone_v2");
        }
        if (set.contains("emails")) {
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.TYPE);
            arrayList.add(EXColumns.LABEL);
            arrayList.add(EXColumns.IS_PRIMARY);
            arrayList.add(EXColumns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/email_v2");
        }
        if (set.contains("addresses")) {
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.TYPE);
            arrayList.add(EXColumns.LABEL);
            arrayList.add(EXColumns.DATA_4);
            arrayList.add(EXColumns.DATA_5);
            arrayList.add(EXColumns.DATA_6);
            arrayList.add(EXColumns.DATA_7);
            arrayList.add(EXColumns.DATA_8);
            arrayList.add(EXColumns.DATA_9);
            arrayList.add(EXColumns.DATA_10);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/postal-address_v2");
        }
        if (set.contains("note")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/note");
        }
        if (set.contains("birthday") || set.contains("dates")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/contact_event");
        }
        if (set.contains("instantMessageAddresses")) {
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.TYPE);
            arrayList.add(EXColumns.DATA_5);
            arrayList.add(EXColumns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/im");
        }
        if (set.contains("urlAddresses")) {
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.TYPE);
            arrayList.add(EXColumns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/website");
        }
        if (set.contains("extraNames")) {
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/nickname");
        }
        if (set.contains("relationships")) {
            arrayList.add(EXColumns.DATA);
            arrayList.add(EXColumns.TYPE);
            arrayList.add(EXColumns.ID);
            str = str + " OR mimetype=?";
            arrayList2.add("vnd.android.cursor.item/relation");
        }
        if (set.contains("phoneticFirstName")) {
            arrayList.add(EXColumns.DATA_7);
        }
        if (set.contains("phoneticLastName")) {
            arrayList.add(EXColumns.DATA_9);
        }
        if (set.contains("phoneticMiddleName")) {
            arrayList.add(EXColumns.DATA_8);
        }
        if (set.contains("namePrefix")) {
            arrayList.add(EXColumns.DATA_4);
        }
        if (set.contains("nameSuffix")) {
            arrayList.add(EXColumns.DATA_6);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("projection", arrayList);
        hashMap.put(BaseSheetViewModel.SAVE_SELECTION, str);
        hashMap.put("selectionArgs", arrayList2);
        return hashMap;
    }

    private Set<String> ensureFieldsSet(Set<String> set) {
        return set == null ? newHashSet("phoneNumbers", "emails", "addresses", "note", "birthday", "dates", "instantMessageAddresses", "urlAddresses", "extraNames", "relationships", "phoneticFirstName", "phoneticLastName", "phoneticMiddleName", "namePrefix", "nameSuffix", "name", "firstName", "middleName", "lastName", "nickname", "id", "jobTitle", "company", "department", "image", "imageAvailable", "note") : set;
    }

    private HashMap<String, Object> fetchContacts(int i11, int i12, String[] strArr, String str, Set<String> set, String str2, Promise promise) {
        Cursor query;
        boolean z11 = true;
        boolean z12 = i12 == 0;
        String str3 = str != null ? str : EXColumns.CONTACT_ID;
        HashMap createProjectionForQuery = createProjectionForQuery(set);
        List list = (List) createProjectionForQuery.get("projection");
        String str4 = (String) createProjectionForQuery.get(BaseSheetViewModel.SAVE_SELECTION);
        ContentResolver resolver = getResolver();
        ArrayList arrayList = (ArrayList) createProjectionForQuery.get("selectionArgs");
        if (strArr != null && strArr.length > 0) {
            query = resolver.query(ContactsContract.Data.CONTENT_URI, (String[]) list.toArray(new String[list.size()]), str3 + " LIKE ?", strArr, null);
        } else {
            query = resolver.query(ContactsContract.Data.CONTENT_URI, (String[]) list.toArray(new String[list.size()]), str4, (String[]) arrayList.toArray(new String[arrayList.size()]), null);
        }
        try {
            if (query != null) {
                Map<String, Contact> loadContactsFrom = loadContactsFrom(query);
                ArrayList arrayList2 = new ArrayList();
                ArrayList<Contact> sortContactsBy = sortContactsBy(new ArrayList<>(loadContactsFrom.values()), str2);
                int size = sortContactsBy.size();
                HashMap<String, Object> hashMap = new HashMap<>();
                for (int i13 = z12 ? 0 : i11; i13 < size; i13++) {
                    Contact contact = sortContactsBy.get(i13);
                    if (!z12 && i13 - i11 >= i12) {
                        break;
                    }
                    arrayList2.add(contact);
                }
                hashMap.put(MessageExtension.FIELD_DATA, arrayList2);
                hashMap.put("hasPreviousPage", Boolean.valueOf(i11 > 0));
                if (i11 + i12 >= size) {
                    z11 = false;
                }
                hashMap.put("hasNextPage", Boolean.valueOf(z11));
                hashMap.put("total", Integer.valueOf(size));
                return hashMap;
            }
            return null;
        } catch (Exception e11) {
            promise.reject(e11);
            return null;
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getAllContactsAsync(Map<String, Object> map, Set<String> set, String str, Promise promise) {
        HashMap<String, Object> fetchContacts = fetchContacts((map.containsKey("pageOffset") && (map.get("pageOffset") instanceof Number)) ? ((Number) map.get("pageOffset")).intValue() : 0, (map.containsKey("pageSize") && (map.get("pageSize") instanceof Number)) ? ((Number) map.get("pageSize")).intValue() : 0, null, null, set, str, promise);
        if (fetchContacts != null) {
            ArrayList arrayList = (ArrayList) fetchContacts.get(MessageExtension.FIELD_DATA);
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            try {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((Contact) it2.next()).toMap(set));
                }
                Bundle bundle = new Bundle();
                bundle.putBoolean("hasNextPage", ((Boolean) fetchContacts.get("hasNextPage")).booleanValue());
                bundle.putBoolean("hasPreviousPage", ((Boolean) fetchContacts.get("hasPreviousPage")).booleanValue());
                bundle.putParcelableArrayList(MessageExtension.FIELD_DATA, arrayList2);
                bundle.putInt("total", ((Integer) fetchContacts.get("total")).intValue());
                promise.resolve(bundle);
            } catch (Exception e11) {
                promise.reject(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Contact getContactById(String str, Set<String> set, Promise promise) {
        HashMap createProjectionForQuery = createProjectionForQuery(set);
        List list = (List) createProjectionForQuery.get("projection");
        String str2 = (String) createProjectionForQuery.get(BaseSheetViewModel.SAVE_SELECTION);
        ArrayList arrayList = (ArrayList) createProjectionForQuery.get("selectionArgs");
        Cursor query = getResolver().query(ContactsContract.Data.CONTENT_URI, (String[]) list.toArray(new String[list.size()]), "contact_id = ?", new String[]{str}, null);
        if (query != null) {
            try {
                try {
                    ArrayList arrayList2 = new ArrayList(loadContactsFrom(query).values());
                    if (arrayList2.size() > 0) {
                        return (Contact) arrayList2.get(0);
                    }
                } catch (Exception e11) {
                    promise.reject(e11);
                }
                return null;
            } finally {
                query.close();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, Object> getContactByName(String str, Set<String> set, String str2, Promise promise) {
        return fetchContacts(0, 9999, new String[]{str}, EXColumns.DISPLAY_NAME, set, str2, promise);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<String> getFieldsSet(ArrayList arrayList) {
        if (arrayList != null) {
            return ensureFieldsSet(convertReadableArray(arrayList));
        }
        return ensureFieldsSet(null);
    }

    private String getLookupKeyForContactId(String str) {
        ContentResolver resolver = getResolver();
        Uri uri = ContactsContract.Contacts.CONTENT_URI;
        String[] strArr = {EXColumns.LOOKUP_KEY};
        Cursor query = resolver.query(uri, strArr, "_id = " + str, null, null);
        if (query.moveToFirst()) {
            return query.getString(0);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ContentResolver getResolver() {
        return getContext().getContentResolver();
    }

    private boolean isMissingReadPermission(Promise promise) {
        Permissions permissions = (Permissions) this.mModuleRegistry.getModule(Permissions.class);
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
            return false;
        }
        boolean hasGrantedPermissions = permissions.hasGrantedPermissions("android.permission.READ_CONTACTS");
        if (!hasGrantedPermissions) {
            promise.reject("E_MISSING_PERMISSION", "Missing read contacts permission.");
        }
        return !hasGrantedPermissions;
    }

    private boolean isMissingWritePermission(Promise promise) {
        Permissions permissions = (Permissions) this.mModuleRegistry.getModule(Permissions.class);
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
            return false;
        }
        boolean hasGrantedPermissions = permissions.hasGrantedPermissions("android.permission.WRITE_CONTACTS");
        if (!hasGrantedPermissions) {
            promise.reject("E_MISSING_PERMISSION", "Missing write contacts permission.");
        }
        return !hasGrantedPermissions;
    }

    private Map<String, Contact> loadContactsFrom(Cursor cursor) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex(EXColumns.CONTACT_ID));
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, new Contact(string));
            }
            ((Contact) linkedHashMap.get(string)).fromCursor(cursor);
        }
        return linkedHashMap;
    }

    private Contact mutateContact(Contact contact, Map<String, Object> map) {
        if (contact == null) {
            contact = new Contact(UUID.randomUUID().toString());
        }
        if (map.containsKey("firstName")) {
            contact.firstName = (String) map.get("firstName");
        }
        if (map.containsKey("middleName")) {
            contact.middleName = (String) map.get("middleName");
        }
        if (map.containsKey("lastName")) {
            contact.lastName = (String) map.get("lastName");
        }
        if (map.containsKey("namePrefix")) {
            contact.prefix = (String) map.get("namePrefix");
        }
        if (map.containsKey("nameSuffix")) {
            contact.suffix = (String) map.get("nameSuffix");
        }
        if (map.containsKey("phoneticFirstName")) {
            contact.phoneticFirstName = (String) map.get("phoneticFirstName");
        }
        if (map.containsKey("phoneticMiddleName")) {
            contact.phoneticMiddleName = (String) map.get("phoneticMiddleName");
        }
        if (map.containsKey("phoneticLastName")) {
            contact.phoneticLastName = (String) map.get("phoneticLastName");
        }
        if (map.containsKey("company")) {
            contact.company = (String) map.get("company");
        }
        if (map.containsKey("jobTitle")) {
            contact.jobTitle = (String) map.get("jobTitle");
        }
        if (map.containsKey("department")) {
            contact.department = (String) map.get("department");
        }
        if (map.containsKey("note")) {
            contact.note = (String) map.get("note");
        }
        if (map.containsKey("image")) {
            if (map.get("image") instanceof String) {
                contact.photoUri = (String) map.get("image");
                contact.hasPhoto = true;
            } else if (map.get("image") instanceof Map) {
                Map map2 = (Map) map.get("image");
                if (map2.containsKey("uri")) {
                    contact.photoUri = (String) map2.get("uri");
                    contact.hasPhoto = true;
                }
            }
        }
        try {
            ArrayList decodeList = BaseModel.decodeList(map.containsKey("addresses") ? (List) map.get("addresses") : null, PostalAddressModel.class);
            if (decodeList != null) {
                contact.addresses = decodeList;
            }
            ArrayList decodeList2 = BaseModel.decodeList(map.containsKey("phoneNumbers") ? (List) map.get("phoneNumbers") : null, PhoneNumberModel.class);
            if (decodeList2 != null) {
                contact.phones = decodeList2;
            }
            ArrayList decodeList3 = BaseModel.decodeList(map.containsKey("emails") ? (List) map.get("emails") : null, EmailModel.class);
            if (decodeList3 != null) {
                contact.emails = decodeList3;
            }
            ArrayList decodeList4 = BaseModel.decodeList(map.containsKey("instantMessageAddresses") ? (List) map.get("instantMessageAddresses") : null, ImAddressModel.class);
            if (decodeList4 != null) {
                contact.imAddresses = decodeList4;
            }
            ArrayList decodeList5 = BaseModel.decodeList(map.containsKey("urlAddresses") ? (List) map.get("urlAddresses") : null, UrlAddressModel.class);
            if (decodeList5 != null) {
                contact.urlAddresses = decodeList5;
            }
            ArrayList decodeList6 = BaseModel.decodeList(map.containsKey("extraNames") ? (List) map.get("extraNames") : null, ExtraNameModel.class);
            if (decodeList6 != null) {
                contact.extraNames = decodeList6;
            }
            ArrayList decodeList7 = BaseModel.decodeList(map.containsKey("dates") ? (List) map.get("dates") : null, DateModel.class);
            if (decodeList7 != null) {
                contact.dates = decodeList7;
            }
            ArrayList decodeList8 = BaseModel.decodeList(map.containsKey("relationships") ? (List) map.get("relationships") : null, RelationshipModel.class);
            if (decodeList8 != null) {
                contact.relationships = decodeList8;
            }
        } catch (Exception unused) {
        }
        return contact;
    }

    private static Set<String> newHashSet(String... strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        return hashSet;
    }

    private void presentEditForm(Contact contact, Promise promise) {
        Uri lookupUri = ContactsContract.Contacts.getLookupUri(Long.parseLong(contact.contactId), contact.lookupKey);
        Intent intent = new Intent("android.intent.action.EDIT");
        intent.setDataAndType(lookupUri, "vnd.android.cursor.item/contact");
        this.mPendingPromise = promise;
        ((ActivityProvider) this.mModuleRegistry.getModule(ActivityProvider.class)).getCurrentActivity().startActivityForResult(intent, RC_EDIT_CONTACT);
    }

    private void presentForm(Contact contact) {
        Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
        intent.putExtra("name", contact.getDisplayName());
        intent.putParcelableArrayListExtra(MessageExtension.FIELD_DATA, contact.getContentValues());
        intent.setFlags(268435456);
        ((ActivityProvider) this.mModuleRegistry.getModule(ActivityProvider.class)).getCurrentActivity().startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList serializeContacts(Collection<Contact> collection, Set<String> set, Promise promise) {
        if (collection == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            for (Contact contact : collection) {
                arrayList.add(contact.toMap(set));
            }
        } catch (Exception e11) {
            promise.reject(e11);
        }
        return arrayList;
    }

    private ArrayList<Contact> sortContactsBy(ArrayList<Contact> arrayList, String str) {
        if (str == null) {
            return arrayList;
        }
        if (str.equals("lastName")) {
            Collections.sort(arrayList, new Comparator<Contact>() { // from class: expo.modules.contacts.ContactsModule.5
                @Override // java.util.Comparator
                public int compare(Contact contact, Contact contact2) {
                    return contact.getLastName().compareToIgnoreCase(contact2.getLastName());
                }
            });
            return arrayList;
        } else if (str.equals("firstName")) {
            Collections.sort(arrayList, new Comparator<Contact>() { // from class: expo.modules.contacts.ContactsModule.4
                @Override // java.util.Comparator
                public int compare(Contact contact, Contact contact2) {
                    return contact.getFirstName().compareToIgnoreCase(contact2.getFirstName());
                }
            });
            return arrayList;
        } else {
            return arrayList;
        }
    }

    @ExpoMethod
    public void addContactAsync(Map<String, Object> map, String str, Promise promise) {
        if (isMissingReadPermission(promise) || isMissingWritePermission(promise)) {
            return;
        }
        try {
            ContentProviderResult[] applyBatch = getResolver().applyBatch("com.android.contacts", mutateContact(null, map).toInsertOperationList());
            if (applyBatch.length > 0) {
                Cursor query = getResolver().query(applyBatch[0].uri, new String[]{EXColumns.CONTACT_ID}, null, null, null);
                if (query == null) {
                    promise.reject("E_ADD_CONTACT_FAILED", "Couldn't get the contact id.");
                    if (query != null) {
                        query.close();
                        return;
                    }
                    return;
                }
                query.moveToNext();
                promise.resolve(String.valueOf(query.getLong(0)));
                query.close();
                return;
            }
            promise.reject("E_ADD_CONTACT_FAILED", "Given contact couldn't be added.");
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void getContactByPhoneNumber(final String str, final Promise promise) {
        if (isMissingReadPermission(promise)) {
            return;
        }
        AsyncTask.execute(new Runnable() { // from class: expo.modules.contacts.ContactsModule.3
            /* JADX WARN: Code restructure failed: missing block: B:17:0x0059, code lost:
                if (r2.isClosed() != false) goto L14;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x005c, code lost:
                r3.resolve(r0);
             */
            /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void run() {
                /*
                    r9 = this;
                    android.os.Bundle r0 = new android.os.Bundle
                    r0.<init>()
                    android.net.Uri r1 = android.provider.ContactsContract.PhoneLookup.CONTENT_FILTER_URI
                    java.lang.String r2 = r2
                    java.lang.String r2 = android.net.Uri.encode(r2)
                    android.net.Uri r4 = android.net.Uri.withAppendedPath(r1, r2)
                    java.lang.String r1 = "display_name"
                    java.lang.String[] r5 = new java.lang.String[]{r1}
                    expo.modules.contacts.ContactsModule r2 = expo.modules.contacts.ContactsModule.this
                    android.content.ContentResolver r3 = expo.modules.contacts.ContactsModule.f(r2)
                    r6 = 0
                    r7 = 0
                    r8 = 0
                    android.database.Cursor r2 = r3.query(r4, r5, r6, r7, r8)
                    if (r2 != 0) goto L30
                    expo.modules.core.Promise r0 = r3
                    java.lang.String r1 = "E_CONTACTS"
                    java.lang.String r2 = "Couldn't query contact by number"
                    r0.reject(r1, r2)
                    return
                L30:
                    boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                    if (r3 == 0) goto L43
                    int r1 = r2.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                    java.lang.String r1 = r2.getString(r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                    java.lang.String r3 = "displayName"
                    r0.putString(r3, r1)     // Catch: java.lang.Throwable -> L4d java.lang.Exception -> L4f
                L43:
                    boolean r1 = r2.isClosed()
                    if (r1 != 0) goto L5c
                L49:
                    r2.close()
                    goto L5c
                L4d:
                    r0 = move-exception
                    goto L62
                L4f:
                    r1 = move-exception
                    expo.modules.core.Promise r3 = r3     // Catch: java.lang.Throwable -> L4d
                    r3.reject(r1)     // Catch: java.lang.Throwable -> L4d
                    boolean r1 = r2.isClosed()
                    if (r1 != 0) goto L5c
                    goto L49
                L5c:
                    expo.modules.core.Promise r1 = r3
                    r1.resolve(r0)
                    return
                L62:
                    boolean r1 = r2.isClosed()
                    if (r1 != 0) goto L6b
                    r2.close()
                L6b:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: expo.modules.contacts.ContactsModule.AnonymousClass3.run():void");
            }
        });
    }

    @ExpoMethod
    public void getContactsAsync(final Map<String, Object> map, final Promise promise) {
        if (isMissingReadPermission(promise)) {
            return;
        }
        new Thread(new Runnable() { // from class: expo.modules.contacts.ContactsModule.2
            @Override // java.lang.Runnable
            public void run() {
                ArrayList arrayList = null;
                String str = (map.containsKey("sort") && (map.get("sort") instanceof String)) ? (String) map.get("sort") : null;
                if (map.containsKey("fields") && (map.get("fields") instanceof ArrayList)) {
                    arrayList = (ArrayList) map.get("fields");
                }
                Set fieldsSet = ContactsModule.this.getFieldsSet(arrayList);
                if (map.containsKey("id") && (map.get("id") instanceof String)) {
                    Contact contactById = ContactsModule.this.getContactById((String) map.get("id"), fieldsSet, promise);
                    Bundle bundle = new Bundle();
                    if (contactById != null) {
                        ArrayList arrayList2 = new ArrayList();
                        arrayList2.add(contactById);
                        ArrayList<? extends Parcelable> serializeContacts = ContactsModule.this.serializeContacts(arrayList2, fieldsSet, promise);
                        if (serializeContacts == null) {
                            return;
                        }
                        bundle.putParcelableArrayList(MessageExtension.FIELD_DATA, serializeContacts);
                    } else {
                        bundle.putParcelableArray(MessageExtension.FIELD_DATA, new Parcelable[0]);
                    }
                    bundle.putBoolean("hasNextPage", false);
                    bundle.putBoolean("hasPreviousPage", false);
                    promise.resolve(bundle);
                } else if (map.containsKey("name") && (map.get("name") instanceof String)) {
                    HashMap contactByName = ContactsModule.this.getContactByName("%" + ((String) map.get("name")) + "%", fieldsSet, str, promise);
                    ArrayList<? extends Parcelable> serializeContacts2 = ContactsModule.this.serializeContacts((Collection) contactByName.get(MessageExtension.FIELD_DATA), fieldsSet, promise);
                    if (serializeContacts2 == null) {
                        return;
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelableArrayList(MessageExtension.FIELD_DATA, serializeContacts2);
                    bundle2.putBoolean("hasNextPage", ((Boolean) contactByName.get("hasNextPage")).booleanValue());
                    bundle2.putBoolean("hasPreviousPage", ((Boolean) contactByName.get("hasPreviousPage")).booleanValue());
                    promise.resolve(bundle2);
                } else {
                    ContactsModule.this.getAllContactsAsync(map, fieldsSet, str, promise);
                }
            }
        }).start();
    }

    @Override // expo.modules.core.ExportedModule
    public String getName() {
        return "ExpoContacts";
    }

    @ExpoMethod
    public void getPermissionsAsync(Promise promise) {
        Permissions permissions = (Permissions) this.mModuleRegistry.getModule(Permissions.class);
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else if (permissions.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
            permissions.getPermissionsWithPromise(promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
        } else {
            permissions.getPermissionsWithPromise(promise, "android.permission.READ_CONTACTS");
        }
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        this.mModuleRegistry = moduleRegistry;
        ((UIManager) moduleRegistry.getModule(UIManager.class)).registerActivityEventListener(this.mActivityEventListener);
    }

    @ExpoMethod
    public void presentFormAsync(String str, Map<String, Object> map, Map<String, Object> map2, Promise promise) {
        if (isMissingReadPermission(promise)) {
            return;
        }
        if (str != null) {
            Contact contactById = getContactById(str, getFieldsSet(null), promise);
            if (contactById == null) {
                promise.reject("E_CONTACTS", "Couldn't find contact with ID.");
                return;
            } else {
                presentEditForm(contactById, promise);
                return;
            }
        }
        presentForm(mutateContact(null, map));
    }

    @ExpoMethod
    public void removeContactAsync(String str, Promise promise) {
        if (isMissingReadPermission(promise) || isMissingWritePermission(promise)) {
            return;
        }
        try {
            getResolver().delete(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str), null, null);
            promise.resolve(null);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ExpoMethod
    public void requestPermissionsAsync(Promise promise) {
        Permissions permissions = (Permissions) this.mModuleRegistry.getModule(Permissions.class);
        if (permissions == null) {
            promise.reject("E_NO_PERMISSIONS", "Permissions module is null. Are you sure all the installed Expo modules are properly linked?");
        } else if (permissions.isPermissionPresentInManifest("android.permission.WRITE_CONTACTS")) {
            permissions.askForPermissionsWithPromise(promise, "android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS");
        } else {
            permissions.askForPermissionsWithPromise(promise, "android.permission.READ_CONTACTS");
        }
    }

    @ExpoMethod
    public void shareContactAsync(String str, String str2, Promise promise) {
        String lookupKeyForContactId = getLookupKeyForContactId(str);
        if (lookupKeyForContactId == null) {
            promise.reject("E_CONTACTS", "Couldn't find lookup key for contact.");
        }
        Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId);
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/x-vcard");
        intent.putExtra("android.intent.extra.STREAM", withAppendedPath);
        intent.putExtra("android.intent.extra.SUBJECT", str2);
        ((ActivityProvider) this.mModuleRegistry.getModule(ActivityProvider.class)).getCurrentActivity().startActivity(intent);
    }

    @ExpoMethod
    public void updateContactAsync(Map<String, Object> map, Promise promise) {
        if (isMissingReadPermission(promise) || isMissingWritePermission(promise)) {
            return;
        }
        String str = map.containsKey("id") ? (String) map.get("id") : null;
        Contact contactById = getContactById(str, getFieldsSet(null), promise);
        if (contactById != null) {
            try {
                if (getResolver().applyBatch("com.android.contacts", mutateContact(contactById, map).toUpdateOperationList()).length > 0) {
                    promise.resolve(str);
                } else {
                    promise.reject("E_UPDATE_CONTACT_FAILED", "Given contact couldn't be updated.");
                }
                return;
            } catch (Exception e11) {
                promise.reject(e11);
                return;
            }
        }
        promise.reject("E_CONTACTS", "Couldn't find contact");
    }

    @ExpoMethod
    public void writeContactToFileAsync(Map<String, Object> map, Promise promise) {
        if (isMissingReadPermission(promise)) {
            return;
        }
        String lookupKeyForContactId = getLookupKeyForContactId(map.containsKey("id") ? (String) map.get("id") : null);
        if (lookupKeyForContactId == null) {
            promise.reject("E_CONTACTS", "Couldn't find lookup key for contact.");
        }
        promise.resolve(Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_VCARD_URI, lookupKeyForContactId).toString());
    }
}