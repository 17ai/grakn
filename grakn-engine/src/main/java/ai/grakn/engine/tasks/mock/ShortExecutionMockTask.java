/*
 * Grakn - A Distributed Semantic Database
 * Copyright (C) 2016  Grakn Labs Limited
 *
 * Grakn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Grakn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Grakn. If not, see <http://www.gnu.org/licenses/gpl.txt>.
 */

package ai.grakn.engine.tasks.mock;

import ai.grakn.engine.TaskId;

import ai.grakn.engine.tasks.manager.TaskCheckpoint;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Mocked task that will finish nearly instantaneously
 *
 * @author alexandraorth, Felix Chapman
 */
public class ShortExecutionMockTask extends MockBackgroundTask {
    public static final AtomicInteger  resumedCounter = new AtomicInteger(0);

    @Override
    protected void executeStartInner(TaskId id) {}

    @Override
    protected void executeResumeInner(TaskCheckpoint checkpoint) {
        resumedCounter.incrementAndGet();
    }
}
