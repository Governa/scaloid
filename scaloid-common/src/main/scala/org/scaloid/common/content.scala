/* 
 *
 * 
 *
 *
 * Less painful Android development with Scala
 *
 * http://scaloid.org
 *
 *
 *
 *
 *
 *
 * Copyright 2013 Sung-Ho Lee and Scaloid team
 *
 * Sung-Ho Lee and Scaloid team licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

/*
 * This file is automatically generated. Any changes on this file will be OVERWRITTEN!
 * To learn how to contribute, please refer to:
 * https://github.com/pocorall/scaloid/wiki/Inside-Scaloid
 */

package org.scaloid.common

import android.content._
import android.util.Log
import android.os._
import scala.collection.mutable.ArrayBuffer
import scala.reflect._


class EventSource0[T] extends ArrayBuffer[() => T] {
  def apply(e: => T) = append(() => e)

  def run() {
    foreach(_())
  }
}

class EventSource1[T <: Function1[_, _]] extends ArrayBuffer[T] {
  def apply(e: T) = append(e)
}

class EventSource2[T <: Function2[_, _, _]] extends ArrayBuffer[T] {
  def apply(e: T) = append(e)
}

/**
 * Callback handler for classes that can be destroyed.
 */
trait Destroyable {
  protected val onDestroyBodies = new ArrayBuffer[() => Any]

  def onDestroy(body: => Any) = {
    val el = (() => body)
    onDestroyBodies += el
    el
  }
}

/**
 * Callback handler for classes that can be created.
 */
trait Creatable {
  protected val onCreateBodies = new ArrayBuffer[() => Any]

  def onCreate(body: => Any) = {
    val el = (() => body)
    onCreateBodies += el
    el
  }
}

/**
 * Callback handler for classes that can be registered and unregistered.
 */
trait Registerable {
  def onRegister(body: => Any): () => Any
  def onUnregister(body: => Any): () => Any
}


/**
* Automatically generated enriching class of android.content.Context.
*/
class RichContext[V <: android.content.Context](val basis: V) extends TraitContext[V]

/**
 * Automatically generated helper trait of android.content.Context. This contains several property accessors.
 */
trait TraitContext[V <: android.content.Context] {

  def basis: V

  implicit val ctx = basis


  @inline def applicationContext = basis.getApplicationContext

  @inline def applicationInfo = basis.getApplicationInfo

  @inline def assets = basis.getAssets

  @inline def cacheDir = basis.getCacheDir

  @inline def classLoader = basis.getClassLoader

  @inline def contentResolver = basis.getContentResolver

  @inline def externalCacheDir = basis.getExternalCacheDir

  @inline def filesDir = basis.getFilesDir

  @inline def mainLooper = basis.getMainLooper

  @inline def packageCodePath = basis.getPackageCodePath

  @inline def packageManager = basis.getPackageManager

  @inline def packageName = basis.getPackageName

  @inline def packageResourcePath = basis.getPackageResourcePath

  @inline def resources = basis.getResources

  @inline def theme = basis.getTheme
  @inline def theme  (p: Int) =            theme_=  (p)
  @inline def theme_=(p: Int) = { basis.setTheme    (p); basis }

  @inline def wallpaper = basis.getWallpaper
  @inline def wallpaper  (p: android.graphics.Bitmap) =            wallpaper_=  (p)
  @inline def wallpaper_=(p: android.graphics.Bitmap) = { basis.setWallpaper    (p); basis }
  @inline def wallpaper  (p: java.io.InputStream) =            wallpaper_=  (p)
  @inline def wallpaper_=(p: java.io.InputStream) = { basis.setWallpaper    (p); basis }

  @inline def wallpaperDesiredMinimumHeight = basis.getWallpaperDesiredMinimumHeight

  @inline def wallpaperDesiredMinimumWidth = basis.getWallpaperDesiredMinimumWidth


  @inline def bindService[T: ClassTag](p1: android.content.ServiceConnection, p2: Int)(implicit context: Context): Boolean = basis.bindService(SIntent[T], p1, p2)

  @inline def removeStickyBroadcast[T: ClassTag](implicit context: Context): Unit = basis.removeStickyBroadcast(SIntent[T])

  @inline def sendBroadcast[T: ClassTag](implicit context: Context): Unit = basis.sendBroadcast(SIntent[T])

  @inline def sendBroadcast[T: ClassTag](p: java.lang.String)(implicit context: Context): Unit = basis.sendBroadcast(SIntent[T], p)

  @inline def sendOrderedBroadcast[T: ClassTag](p: java.lang.String)(implicit context: Context): Unit = basis.sendOrderedBroadcast(SIntent[T], p)

  @inline def sendOrderedBroadcast[T: ClassTag](p1: java.lang.String, p2: android.content.BroadcastReceiver, p3: android.os.Handler, p4: Int, p5: java.lang.String, p6: android.os.Bundle)(implicit context: Context): Unit = basis.sendOrderedBroadcast(SIntent[T], p1, p2, p3, p4, p5, p6)

  @inline def sendStickyBroadcast[T: ClassTag](implicit context: Context): Unit = basis.sendStickyBroadcast(SIntent[T])

  @inline def sendStickyOrderedBroadcast[T: ClassTag](p1: android.content.BroadcastReceiver, p2: android.os.Handler, p3: Int, p4: java.lang.String, p5: android.os.Bundle)(implicit context: Context): Unit = basis.sendStickyOrderedBroadcast(SIntent[T], p1, p2, p3, p4, p5)

  @inline def startActivity[T: ClassTag](implicit context: Context): Unit = basis.startActivity(SIntent[T])

  @inline def startService[T: ClassTag](implicit context: Context): android.content.ComponentName = basis.startService(SIntent[T])

  @inline def stopService[T: ClassTag](implicit context: Context): Boolean = basis.stopService(SIntent[T])
}



/**
 * Enriched trait of the class android.content.Context. To enable Scaloid support for subclasses android.content.Context, extend this trait.
 *
 * Refer the URL below for more details.
 *
 * [[https://github.com/pocorall/scaloid/?134#trait-scontext]]
 *
 */
trait SContext extends Context with TraitContext[SContext] with TagUtil {
  def basis: SContext = this
}

/**
* Automatically generated enriching class of android.content.ContextWrapper.
*/
class RichContextWrapper[V <: android.content.ContextWrapper](val basis: V) extends TraitContextWrapper[V]

/**
 * Automatically generated helper trait of android.content.ContextWrapper. This contains several property accessors.
 */
trait TraitContextWrapper[V <: android.content.ContextWrapper] extends TraitContext[V] {




  @inline def baseContext = basis.getBaseContext


}

/**
* Automatically generated concrete helper class of android.content.ContextWrapper.
*/
class SContextWrapper()(implicit base: android.content.Context)
    extends android.content.ContextWrapper(base) with TraitContextWrapper[SContextWrapper] {

  def basis = this

}

object SContextWrapper {
  def apply()(implicit base: android.content.Context): SContextWrapper = {
    val v = new SContextWrapper
    v
  }

}



/**
 * When you register BroadcastReceiver with Context.registerReceiver() you have to unregister it to prevent memory leak.
 * Trait UnregisterReceiver handles these chores for you.
 * All you need to do is append the trait to your class.
 *
 * {{{
 *class MyService extends SService with UnregisterReceiver {
   def func() {
     // ...
     registerReceiver(receiver, intentFilter)
     // Done! automatically unregistered at UnregisterReceiverService.onDestroy()
   }
 }
 * }}}
 * See also: [[https://github.com/pocorall/scaloid/wiki/Basics#trait-unregisterreceiver]]
 */
trait UnregisterReceiver extends ContextWrapper with Destroyable {
  /**
    * Internal implementation for (un)registering the receiver. You do not need to call this method.
    */
  override def registerReceiver(receiver: BroadcastReceiver, filter: IntentFilter): android.content.Intent = {
    onDestroy {
      Log.i("ScalaUtils", "Unregister BroadcastReceiver: "+receiver)
      try {
        unregisterReceiver(receiver)
      } catch {
        // Suppress "Receiver not registered" exception
        // Refer to http://stackoverflow.com/questions/2682043/how-to-check-if-receiver-is-registered-in-android
        case e: IllegalArgumentException => e.printStackTrace()
      }
    }

    super.registerReceiver(receiver, filter)
  }
}

/**
 * Provides shortcuts for intent creation.
 *
 * {{{
 *   SIntent[MyActivity]
 * }}}
 *
 */
object SIntent {
  @inline def apply[T](implicit context: Context, mt: ClassTag[T]) = new Intent(context, mt.runtimeClass)

  @inline def apply[T](action: String)(implicit context: Context, mt: ClassTag[T]): Intent = SIntent[T].setAction(action)
}


/**
 * An in-process service connector that can bound [[LocalService]]. This yields far more concise code than that uses plain-old Android API.
 *
 * Please refer to the URL below for more details.
 *
 * [[http://blog.scaloid.org/2013/03/introducing-localservice.html]]
 */
class LocalServiceConnection[S <: LocalService](bindFlag: Int = Context.BIND_AUTO_CREATE)(implicit ctx: Context, reg: Registerable, ev: Null <:< S, mf: ClassTag[S]) extends ServiceConnection {
  var service: S = null
  var componentName:ComponentName = _
  var binder: IBinder = _
  var onConnected = new EventSource0[Unit]
  var onDisconnected = new EventSource0[Unit]

  /**
   * Internal implementation for handling the service connection. You do not need to call this method.
   */
  def onServiceConnected(p1: ComponentName, b: IBinder) {
    service = (b.asInstanceOf[LocalService#ScaloidServiceBinder]).service.asInstanceOf[S]
    componentName = p1
    binder = b
    onConnected.run()
  }

  /**
   * Internal implementation for handling the service connection. You do not need to call this method.
   */
  def onServiceDisconnected(p1: ComponentName) {
    service = null
    onDisconnected.run()
  }

  /**
   * Returns true if the service is currently connected.
   */
  def connected: Boolean = service != null

  reg.onRegister {
    ctx.bindService(SIntent[S], this, bindFlag)
  }

  reg.onUnregister {
    ctx.unbindService(this)
  }
}
