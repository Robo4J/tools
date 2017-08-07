/*
 * Copyright (C) 2017. Miroslav Kopecky
 * This TaskResult.java  is part of robo4j.
 * path: /Users/miroslavkopecky/GiTHub_MiroKopecky/robo4j-tools/compiler/robo4j-center/src/main/java/com/robo4j/tools/center/util/TaskResult.java
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

package com.robo4j.tools.center.util;

/**
 * @author Marcus Hirt (@hirt)
 * @author Miro Wengner (@miragemiko)
 */
public class TaskResult {

	private boolean status;

	public TaskResult(boolean status) {
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "TaskResult{" + "status=" + status + '}';
	}
}
