// GENERATED
package com.fkorotkov.kubernetes

import io.fabric8.kubernetes.api.model.GlusterfsVolumeSource
import io.fabric8.kubernetes.api.model.PersistentVolumeSpec
import io.fabric8.kubernetes.api.model.Volume


fun  PersistentVolumeSpec.`glusterfs`(block: GlusterfsVolumeSource.() -> Unit = {}) {
  if(this.`glusterfs` == null) {
    this.`glusterfs` = GlusterfsVolumeSource()
  }

  this.`glusterfs`.block()
}


fun  Volume.`glusterfs`(block: GlusterfsVolumeSource.() -> Unit = {}) {
  if(this.`glusterfs` == null) {
    this.`glusterfs` = GlusterfsVolumeSource()
  }

  this.`glusterfs`.block()
}

