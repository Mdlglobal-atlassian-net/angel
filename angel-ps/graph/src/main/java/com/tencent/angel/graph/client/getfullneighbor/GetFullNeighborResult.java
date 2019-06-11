/*
 * Tencent is pleased to support the open source community by making Angel available.
 *
 * Copyright (C) 2017-2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 *
 * https://opensource.org/licenses/Apache-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *
 */

package com.tencent.angel.graph.client.getfullneighbor;

import com.tencent.angel.graph.client.NodeIDWeightPairs;
import com.tencent.angel.ml.matrix.psf.get.base.GetResult;
import java.util.Map;

/**
 * Result of GetNeighbor
 */
public class GetFullNeighborResult extends GetResult {
  /**
   * Node id to neighbors map
   */
  private Map<Long, NodeIDWeightPairs> nodeIdToNeighbors;

  GetFullNeighborResult(Map<Long, NodeIDWeightPairs> nodeIdToNeighbors) {
    this.nodeIdToNeighbors = nodeIdToNeighbors;
  }

  public Map<Long, NodeIDWeightPairs> getNodeIdToNeighbors() {
    return nodeIdToNeighbors;
  }

  public void setNodeIdToNeighbors(
      Map<Long, NodeIDWeightPairs> nodeIdToNeighbors) {
    this.nodeIdToNeighbors = nodeIdToNeighbors;
  }
}