 // NDSoftwares

package com.ndsoftwares.dialogs.core

import androidx.annotation.AttrRes
import com.ndsoftwares.dialogs.R

/**
 * Available button styles.
 */
enum class ButtonStyle(@AttrRes val styleRes: Int) {

    /**
     * Uses the style Widget.MaterialComponents.Button.TextButton.
     */
    TEXT(R.attr.materialButtonOutlinedStyle),

    /**
     * Uses the style Widget.MaterialComponents.Button.OutlinedButton.
     */
    OUTLINED(R.attr.materialButtonOutlinedStyle),

    /**
     * Uses the style Widget.MaterialComponents.Button.
     */
    NORMAL(R.attr.materialButtonStyle),
}