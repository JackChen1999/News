package com.google.topnews.dao;

import android.content.ContentValues;

import com.google.topnews.bean.ChannelItem;

import java.util.List;
import java.util.Map;

public interface ChannelDao {

    public boolean addCache(ChannelItem item);

    public boolean deleteCache(String whereClause, String[] whereArgs);

    public boolean updateCache(ContentValues values, String whereClause, String[] whereArgs);

    public Map<String, String> viewCache(String selection, String[] selectionArgs);

    public List<Map<String, String>> listCache(String selection, String[] selectionArgs);

    public void clearFeedTable();
}