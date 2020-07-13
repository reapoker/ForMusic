package com.example.ningyuwen.music.view.activity.i;

import com.example.ningyuwen.music.model.entity.music.MusicData;

/**
 * BaseActivity实现
 * Created by reapoker on .
 */

public interface IBaseActivity {
    MusicData getDataFromPid(long pid);
    void setIsLoveToDB(long pid, boolean isLove);
}
