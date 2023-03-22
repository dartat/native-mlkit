/*
 * Copyright 2020 Google LLC. All rights reserved.
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
 */

package com.google.mlkit.vision.demo.java.textdetector;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.Task;
import com.google.mlkit.vision.common.InputImage;
import com.google.mlkit.vision.demo.GraphicOverlay;
import com.google.mlkit.vision.demo.java.VisionProcessorBase;
import com.google.mlkit.vision.demo.preference.PreferenceUtils;
import com.google.mlkit.vision.text.Text;
import com.google.mlkit.vision.text.Text.Element;
import com.google.mlkit.vision.text.Text.Line;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.TextRecognizer;
import com.google.mlkit.vision.text.TextRecognizerOptionsInterface;

import java.util.List;

/** Processor for the text detector demo. */
public class TextRecognitionProcessorTest extends VisionProcessorBase<Text> {

  private static final String TAG = "TextRecProcessor";

  private final Boolean shouldGroupRecognizedTextInBlocks;
  private final Boolean showLanguageTag;
  private final boolean showConfidence;

  public TextRecognitionProcessorTest(
      Context context, TextRecognizerOptionsInterface textRecognizerOptions) {
    super(context);
    shouldGroupRecognizedTextInBlocks = PreferenceUtils.shouldGroupRecognizedTextInBlocks(context);
    showLanguageTag = PreferenceUtils.showLanguageTag(context);
    showConfidence = PreferenceUtils.shouldShowTextConfidence(context);

  }

  @Override
  public void stop() {
    super.stop();
  }

  @Override
  protected Task<Text> detectInImage(InputImage image) {
    return null;
  }

  @Override
  protected void onSuccess(@NonNull Text text, @NonNull GraphicOverlay graphicOverlay) {

  }

  @Override
  protected void onFailure(@NonNull Exception e) {
    Log.w(TAG, "Text detection failed." + e);
  }
}
