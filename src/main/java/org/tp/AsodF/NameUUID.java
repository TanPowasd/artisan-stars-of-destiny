package org.tp.AsodF;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

//通过字符串生成UUID
public class NameUUID {
    public static UUID GetUUID_fromName(String name) {
        /*
        通过字符串生成UUID，可以保证同一个名字生成的UUID是唯一的,但名字相同UUID相同
        name-md5-uuid
        */
        String md5 = DigestUtils.md5Hex(name);
        UUID uuid = UUID.nameUUIDFromBytes(md5.getBytes());
        return uuid;
    }
    public static String GetUUID_StringMOD_fromName(String name) {
        String md5 = DigestUtils.md5Hex(name);
        UUID uuid = UUID.nameUUIDFromBytes(md5.getBytes());
        return uuid.toString();
    }
}
