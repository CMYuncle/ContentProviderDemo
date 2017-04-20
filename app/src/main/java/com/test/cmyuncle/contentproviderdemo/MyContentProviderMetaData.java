package com.test.cmyuncle.contentproviderdemo;

import android.net.Uri;
import android.provider.BaseColumns;

import java.net.URI;

/**
 * Created by CmyUncle on 2017/4/19.
 */
public class MyContentProviderMetaData {
    public static final String AUTHORITIES="com.test.cmyuncle.contentproviderdemo.MyContentProvider";

    public static final String DATABASE_NAME = "myContentProvider.db";

    public static final int DATABASE_VERSION = 1;

    public static final String USERS_TABLE_NAME = "user";

    public static final class UserTableMetaData implements BaseColumns{
        public static final String TABLE_NAME = "user";

        public static final Uri Content_URI = Uri.parse("content://" + AUTHORITIES+ "user");

        public static final String CONTENT_TYPE = "vnd.android.cursor.dir/vnd.myprovider.user";

        public static final String CONTENT_TYPE_ITEM = "vnd.android.cursor.item/vnd.myprovider.user";

        //列名
        public static final String USER_NAME = "name";
         //默认的排序方法
         public static final String DEFAULT_SORT_ORDER = "_id desc";

    }
}
