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
 * The Class SVCRegMr.
 * 
 * This class is a stateful representation of the memory registration call (RdmaVerbs.regMr). 
 */
public abstract class SVCRegMr implements StatefulVerbCall<SVCRegMr> {
	
	/**
	 * Gets the memory region associated with the last execute() call of this object.
	 *
	 * @return the memory region. 
	 */
	public abstract IbvMr getMr();
	
}
