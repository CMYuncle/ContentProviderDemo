package com.test.cmyuncle.contentproviderdemo;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.Nullable;

import java.util.HashMap;

/**
 * Created by CmyUncle on 2017/4/19.
 */
public class MyContentProvider extends ContentProvider {
    public static final int INCOMING_USER_COLLECTION = 1;
    public static final int INCOMING_USER_SINGLE = 2;

    public static final UriMatcher uriMatcher;
    static {
        uriMatcher = new UriMatcher(UriMatcher.NO_MATCH);
        uriMatcher.addURI(MyContentProviderMetaData.AUTHORITIES,"/user",INCOMING_USER_COLLECTION);
        uriMatcher.addURI(MyContentProviderMetaData.AUTHORITIES,"/user#",INCOMING_USER_SINGLE);

    }

    public static HashMap userProjectionMap;
    static {
        userProjectionMap = new HashMap();
        userProjectionMap.put(MyContentProviderMetaData.UserTableMetaData._ID, MyContentProviderMetaData.UserTableMetaData._ID);
        userProjectionMap.put(MyContentProviderMetaData.UserTableMetaData.USER_NAME, MyContentProviderMetaData.UserTableMetaData.USER_NAME);
    }




    @Override
    public boolean onCreate() {
        return false;
    }

    @Nullable
    @Override
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Nullable
    @Override
    public String getType(Uri uri) {
        return null;
    }

    @Nullable
    @Override
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
