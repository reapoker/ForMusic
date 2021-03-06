package greendao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.ningyuwen.music.model.entity.music.MusicBasicInfo;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MUSIC_BASIC_INFO".
*/
public class MusicBasicInfoDao extends AbstractDao<MusicBasicInfo, Long> {

    public static final String TABLENAME = "MUSIC_BASIC_INFO";

    /**
     * Properties of entity MusicBasicInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property PId = new Property(0, Long.class, "pId", true, "_id");
        public final static Property MusicName = new Property(1, String.class, "musicName", false, "MUSIC_NAME");
        public final static Property MusicPlayer = new Property(2, String.class, "musicPlayer", false, "MUSIC_PLAYER");
        public final static Property WhichApp = new Property(3, String.class, "whichApp", false, "WHICH_APP");
        public final static Property MusicTime = new Property(4, int.class, "musicTime", false, "MUSIC_TIME");
        public final static Property MusicAlbum = new Property(5, String.class, "musicAlbum", false, "MUSIC_ALBUM");
        public final static Property MusicAlbumId = new Property(6, long.class, "musicAlbumId", false, "MUSIC_ALBUM_ID");
        public final static Property MusicFilePath = new Property(7, String.class, "musicFilePath", false, "MUSIC_FILE_PATH");
        public final static Property MusicFileSize = new Property(8, long.class, "musicFileSize", false, "MUSIC_FILE_SIZE");
        public final static Property MusicLyricPath = new Property(9, String.class, "musicLyricPath", false, "MUSIC_LYRIC_PATH");
        public final static Property MusicAlbumPicUrl = new Property(10, String.class, "musicAlbumPicUrl", false, "MUSIC_ALBUM_PIC_URL");
        public final static Property MusicAlbumPicPath = new Property(11, String.class, "musicAlbumPicPath", false, "MUSIC_ALBUM_PIC_PATH");
    }


    public MusicBasicInfoDao(DaoConfig config) {
        super(config);
    }
    
    public MusicBasicInfoDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MUSIC_BASIC_INFO\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: pId
                "\"MUSIC_NAME\" TEXT," + // 1: musicName
                "\"MUSIC_PLAYER\" TEXT," + // 2: musicPlayer
                "\"WHICH_APP\" TEXT," + // 3: whichApp
                "\"MUSIC_TIME\" INTEGER NOT NULL ," + // 4: musicTime
                "\"MUSIC_ALBUM\" TEXT," + // 5: musicAlbum
                "\"MUSIC_ALBUM_ID\" INTEGER NOT NULL ," + // 6: musicAlbumId
                "\"MUSIC_FILE_PATH\" TEXT," + // 7: musicFilePath
                "\"MUSIC_FILE_SIZE\" INTEGER NOT NULL ," + // 8: musicFileSize
                "\"MUSIC_LYRIC_PATH\" TEXT," + // 9: musicLyricPath
                "\"MUSIC_ALBUM_PIC_URL\" TEXT," + // 10: musicAlbumPicUrl
                "\"MUSIC_ALBUM_PIC_PATH\" TEXT);"); // 11: musicAlbumPicPath
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MUSIC_BASIC_INFO\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, MusicBasicInfo entity) {
        stmt.clearBindings();
 
        Long pId = entity.getPId();
        if (pId != null) {
            stmt.bindLong(1, pId);
        }
 
        String musicName = entity.getMusicName();
        if (musicName != null) {
            stmt.bindString(2, musicName);
        }
 
        String musicPlayer = entity.getMusicPlayer();
        if (musicPlayer != null) {
            stmt.bindString(3, musicPlayer);
        }
 
        String whichApp = entity.getWhichApp();
        if (whichApp != null) {
            stmt.bindString(4, whichApp);
        }
        stmt.bindLong(5, entity.getMusicTime());
 
        String musicAlbum = entity.getMusicAlbum();
        if (musicAlbum != null) {
            stmt.bindString(6, musicAlbum);
        }
        stmt.bindLong(7, entity.getMusicAlbumId());
 
        String musicFilePath = entity.getMusicFilePath();
        if (musicFilePath != null) {
            stmt.bindString(8, musicFilePath);
        }
        stmt.bindLong(9, entity.getMusicFileSize());
 
        String musicLyricPath = entity.getMusicLyricPath();
        if (musicLyricPath != null) {
            stmt.bindString(10, musicLyricPath);
        }
 
        String musicAlbumPicUrl = entity.getMusicAlbumPicUrl();
        if (musicAlbumPicUrl != null) {
            stmt.bindString(11, musicAlbumPicUrl);
        }
 
        String musicAlbumPicPath = entity.getMusicAlbumPicPath();
        if (musicAlbumPicPath != null) {
            stmt.bindString(12, musicAlbumPicPath);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, MusicBasicInfo entity) {
        stmt.clearBindings();
 
        Long pId = entity.getPId();
        if (pId != null) {
            stmt.bindLong(1, pId);
        }
 
        String musicName = entity.getMusicName();
        if (musicName != null) {
            stmt.bindString(2, musicName);
        }
 
        String musicPlayer = entity.getMusicPlayer();
        if (musicPlayer != null) {
            stmt.bindString(3, musicPlayer);
        }
 
        String whichApp = entity.getWhichApp();
        if (whichApp != null) {
            stmt.bindString(4, whichApp);
        }
        stmt.bindLong(5, entity.getMusicTime());
 
        String musicAlbum = entity.getMusicAlbum();
        if (musicAlbum != null) {
            stmt.bindString(6, musicAlbum);
        }
        stmt.bindLong(7, entity.getMusicAlbumId());
 
        String musicFilePath = entity.getMusicFilePath();
        if (musicFilePath != null) {
            stmt.bindString(8, musicFilePath);
        }
        stmt.bindLong(9, entity.getMusicFileSize());
 
        String musicLyricPath = entity.getMusicLyricPath();
        if (musicLyricPath != null) {
            stmt.bindString(10, musicLyricPath);
        }
 
        String musicAlbumPicUrl = entity.getMusicAlbumPicUrl();
        if (musicAlbumPicUrl != null) {
            stmt.bindString(11, musicAlbumPicUrl);
        }
 
        String musicAlbumPicPath = entity.getMusicAlbumPicPath();
        if (musicAlbumPicPath != null) {
            stmt.bindString(12, musicAlbumPicPath);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public MusicBasicInfo readEntity(Cursor cursor, int offset) {
        MusicBasicInfo entity = new MusicBasicInfo( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // pId
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // musicName
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // musicPlayer
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // whichApp
            cursor.getInt(offset + 4), // musicTime
            cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5), // musicAlbum
            cursor.getLong(offset + 6), // musicAlbumId
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // musicFilePath
            cursor.getLong(offset + 8), // musicFileSize
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // musicLyricPath
            cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10), // musicAlbumPicUrl
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11) // musicAlbumPicPath
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, MusicBasicInfo entity, int offset) {
        entity.setPId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setMusicName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setMusicPlayer(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setWhichApp(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setMusicTime(cursor.getInt(offset + 4));
        entity.setMusicAlbum(cursor.isNull(offset + 5) ? null : cursor.getString(offset + 5));
        entity.setMusicAlbumId(cursor.getLong(offset + 6));
        entity.setMusicFilePath(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setMusicFileSize(cursor.getLong(offset + 8));
        entity.setMusicLyricPath(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setMusicAlbumPicUrl(cursor.isNull(offset + 10) ? null : cursor.getString(offset + 10));
        entity.setMusicAlbumPicPath(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(MusicBasicInfo entity, long rowId) {
        entity.setPId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(MusicBasicInfo entity) {
        if(entity != null) {
            return entity.getPId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(MusicBasicInfo entity) {
        return entity.getPId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
