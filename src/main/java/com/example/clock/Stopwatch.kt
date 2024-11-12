

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Stopwatch: ImageVector
	get() {
		if (_Stopwatch != null) {
			return _Stopwatch!!
		}
		_Stopwatch = ImageVector.Builder(
            name = "Stopwatch",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFFF0F0F0)),
    			fillAlpha = 1.0f,
    			stroke = null,
    			strokeAlpha = 1.0f,
    			strokeLineWidth = 1.0f,
    			strokeLineCap = StrokeCap.Butt,
    			strokeLineJoin = StrokeJoin.Miter,
    			strokeLineMiter = 1.0f,
    			pathFillType = PathFillType.NonZero
			) {
				moveTo(12f, 20.5f)
				curveTo(10.14350f, 20.50f, 8.3630f, 19.76250f, 7.05030f, 18.44970f)
				curveTo(5.73750f, 17.1370f, 50f, 15.35650f, 50f, 13.50f)
				curveTo(50f, 11.64350f, 5.73750f, 9.8630f, 7.05030f, 8.55030f)
				curveTo(8.3630f, 7.23750f, 10.14350f, 6.50f, 120f, 6.50f)
				curveTo(13.85650f, 6.50f, 15.6370f, 7.23750f, 16.94970f, 8.55030f)
				curveTo(18.26250f, 9.8630f, 190f, 11.64350f, 190f, 13.50f)
				curveTo(190f, 15.35650f, 18.26250f, 17.1370f, 16.94970f, 18.44970f)
				curveTo(15.6370f, 19.76250f, 13.85650f, 20.50f, 120f, 20.50f)
				close()
				moveTo(19.03f, 7.89f)
				lineTo(20.45f, 6.47f)
				curveTo(200f, 5.960f, 19.550f, 5.50f, 19.040f, 5.060f)
				lineTo(17.62f, 6.5f)
				curveTo(16.070f, 5.240f, 14.120f, 4.50f, 120f, 4.50f)
				curveTo(9.6130f, 4.50f, 7.32390f, 5.44820f, 5.6360f, 7.1360f)
				curveTo(3.94820f, 8.82390f, 30f, 11.11310f, 30f, 13.50f)
				curveTo(30f, 15.88690f, 3.94820f, 18.17610f, 5.6360f, 19.8640f)
				curveTo(7.32390f, 21.55180f, 9.6130f, 22.50f, 120f, 22.50f)
				curveTo(170f, 22.50f, 210f, 18.470f, 210f, 13.50f)
				curveTo(210f, 11.380f, 20.260f, 9.430f, 19.030f, 7.890f)
				close()
				moveTo(11f, 14.5f)
				horizontalLineTo(13f)
				verticalLineTo(8.5f)
				horizontalLineTo(11f)
				moveTo(15f, 1.5f)
				horizontalLineTo(9f)
				verticalLineTo(3.5f)
				horizontalLineTo(15f)
				verticalLineTo(1.5f)
				close()
			}
		}.build()
		return _Stopwatch!!
	}

private var _Stopwatch: ImageVector? = null
