/*
 * Copyright (C) 2017. Miroslav Kopecky
 * This CenterCommand.java  is part of robo4j.
 * path: /Users/miroslavkopecky/GiTHub_MiroKopecky/robo4j-tools/compiler/robo4j-center/src/main/java/com/robo4j/tools/center/enums/CenterCommand.java
 * module: robo4j-center_main
 *
 * robo4j is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * robo4j is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with robo4j .  If not, see <http://www.gnu.org/licenses/>.
 */

package com.robo4j.tools.center.enums;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Marcus Hirt (@hirt)
 * @author Miro Wengner (@miragemiko)
 */
public enum CenterCommand {

    //@formatter:off
    COMPILE     (0, "compile"),
    UPLOAD      (1, "upload")
    ;
    //@formatter:on

    private static volatile Map<String, CenterCommand> nameToCommandMap;
    private final int id;
    private final String name;

    CenterCommand(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public static CenterCommand getCommandByName(String name){
        if(nameToCommandMap == null){
            nameToCommandMap = initMap();
        }
        return nameToCommandMap.get(name);
    }

    private static Map<String, CenterCommand> initMap(){
        return Stream.of(values()).collect(Collectors.toMap(CenterCommand::getName, e -> e));
    }



    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                '}';
    }
}
