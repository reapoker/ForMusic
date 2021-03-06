package com.example.ningyuwen.music.presenter.i;

import com.example.ningyuwen.music.model.entity.music.MusicBasicInfo;
import com.example.ningyuwen.music.model.entity.music.MusicData;

import java.util.List;

/**
 * 接口，歌单页面
 * Created by reapoker .
 */

public interface IMusicSongListPresenter {
    List<MusicData> getSongListInfoFromDB(long musicListId);                           //从数据库获取歌单数据
//    List<MusicData> getMusicDataFromMusicListPid(long musicListId);     //从数据库
}
