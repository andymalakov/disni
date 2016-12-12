/*
 * jVerbs: RDMA verbs support for the Java Virtual Machine
 *
 * Author: Patrick Stuedi <stu@zurich.ibm.com>
 *
 * Copyright (C) 2016, IBM Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.ibm.disni.rdma.verbs;

/**
 * The Class SVCPostRecv.
 * 
 * This class is a stateful representation of the post-recv verb call (RdmaVerbs.postRecv). 
 */
public abstract class SVCPostRecv implements StatefulVerbCall<SVCPostRecv> {

	/**
	 * Access a specific work request of this SVC object.
	 *
	 * @param index the work request
	 * @return the work request
	 */
	public abstract RecvWRMod getWrMod(int index);
	
	/**
	 * Provides access methods to modify a given work-request belonging to this SVC object.
	 */
	public interface RecvWRMod {
		
		/**
		 * Retrieve the current work-request id 
		 *
		 * @return the wr_id
		 */
		long getWr_id();

		/**
		 * Modify the work-request id
		 *
		 * @param wr_id the new wr_id
		 */
		void setWr_id(long wr_id);


		/**
		 * Returns a specific scatter/gather element of this work request.
		 *
		 * @param index the sg element.
		 * @return the sg element.
		 */
		SgeMod getSgeMod(int index);

		/**
		 * The number of scatter/gather elements in this work request.
		 *
		 * @return the num_sge
		 */
		int getNum_sge();


	}

}
