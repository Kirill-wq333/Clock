

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp


public val AlarmClock: ImageVector
	get() {
		if (_AlarmClock != null) {
			return _AlarmClock!!
		}
		_AlarmClock = ImageVector.Builder(
            name = "AlarmClock",
            defaultWidth = 24.dp,
            defaultHeight = 25.dp,
            viewportWidth = 24f,
            viewportHeight = 25f
        ).apply {
			path(
    			fill = SolidColor(Color(0xFFFFFFFF)),
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
				curveTo(50f, 11.64350f, 5.73750f, 9.8630f, 7.05030f, 8.55020f)
				curveTo(8.3630f, 7.23750f, 10.14350f, 6.50f, 120f, 6.50f)
				curveTo(13.85650f, 6.50f, 15.6370f, 7.23750f, 16.94970f, 8.55020f)
				curveTo(18.26250f, 9.8630f, 190f, 11.64350f, 190f, 13.50f)
				curveTo(190f, 15.35650f, 18.26250f, 17.1370f, 16.94970f, 18.44970f)
				curveTo(15.6370f, 19.76250f, 13.85650f, 20.50f, 120f, 20.50f)
				close()
				moveTo(12f, 4.49999f)
				curveTo(9.6130f, 4.50f, 7.32390f, 5.44820f, 5.6360f, 7.1360f)
				curveTo(3.94820f, 8.82390f, 30f, 11.1130f, 30f, 13.50f)
				curveTo(30f, 15.88690f, 3.94820f, 18.17610f, 5.6360f, 19.86390f)
				curveTo(7.32390f, 21.55180f, 9.6130f, 22.50f, 120f, 22.50f)
				curveTo(14.38690f, 22.50f, 16.67610f, 21.55180f, 18.3640f, 19.86390f)
				curveTo(20.05180f, 18.17610f, 210f, 15.88690f, 210f, 13.50f)
				curveTo(210f, 11.1130f, 20.05180f, 8.82390f, 18.3640f, 7.1360f)
				curveTo(16.67610f, 5.44820f, 14.38690f, 4.50f, 120f, 4.50f)
				close()
				moveTo(12.5f, 8.49999f)
				horizontalLineTo(11f)
				verticalLineTo(14.5f)
				lineTo(15.75f, 17.35f)
				lineTo(16.5f, 16.12f)
				lineTo(12.5f, 13.75f)
				verticalLineTo(8.49999f)
				close()
				moveTo(7.88f, 3.88999f)
				lineTo(6.6f, 2.35999f)
				lineTo(2f, 6.20999f)
				lineTo(3.29f, 7.73998f)
				lineTo(7.88f, 3.88999f)
				close()
				moveTo(22f, 6.21999f)
				lineTo(17.4f, 2.35999f)
				lineTo(16.11f, 3.88999f)
				lineTo(20.71f, 7.74999f)
				lineTo(22f, 6.21999f)
				close()
			}
		}.build()
		return _AlarmClock!!
	}


private var _AlarmClock: ImageVector? = null
