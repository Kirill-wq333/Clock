
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

public val Timer: ImageVector
	get() {
		if (_Timer != null) {
			return _Timer!!
		}
		_Timer = ImageVector.Builder(
            name = "Timer",
            defaultWidth = 25.dp,
            defaultHeight = 25.dp,
            viewportWidth = 25f,
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
				moveTo(13.5f, 5.57001f)
				curveTo(15.2490f, 5.82630f, 16.83630f, 6.73460f, 17.94340f, 8.11260f)
				curveTo(19.05050f, 9.49060f, 19.59540f, 11.23630f, 19.46880f, 12.99940f)
				curveTo(19.34230f, 14.76250f, 18.55350f, 16.41250f, 17.2610f, 17.61820f)
				curveTo(15.96840f, 18.82390f, 14.26760f, 19.49620f, 12.50f, 19.50f)
				curveTo(11.09050f, 19.50010f, 9.71380f, 19.07460f, 8.55010f, 18.27930f)
				curveTo(7.38640f, 17.4840f, 6.48990f, 16.35590f, 5.97790f, 15.04260f)
				curveTo(5.46590f, 13.72940f, 5.36230f, 12.29220f, 5.68060f, 10.91910f)
				curveTo(5.9990f, 9.5460f, 6.72440f, 8.3010f, 7.7620f, 7.3470f)
				lineTo(6.34699f, 5.93201f)
				curveTo(4.7870f, 7.39380f, 3.79840f, 9.36320f, 3.55810f, 11.48750f)
				curveTo(3.31780f, 13.61180f, 3.84150f, 15.75220f, 5.03550f, 17.52560f)
				curveTo(6.22940f, 19.2990f, 8.01570f, 20.58940f, 10.07430f, 21.16580f)
				curveTo(12.1330f, 21.74230f, 14.32960f, 21.56710f, 16.27090f, 20.67160f)
				curveTo(18.21210f, 19.77610f, 19.77120f, 18.21890f, 20.6690f, 16.27870f)
				curveTo(21.56680f, 14.33850f, 21.74460f, 12.14210f, 21.17060f, 10.08270f)
				curveTo(20.59660f, 8.02340f, 19.30830f, 6.23560f, 17.53630f, 5.03950f)
				curveTo(15.76440f, 3.84350f, 13.62460f, 3.31720f, 11.50f, 3.5550f)
				verticalLineTo(9.58501f)
				horizontalLineTo(13.5f)
				verticalLineTo(5.57001f)
				close()
			}
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
				moveTo(8.207f, 9.20697f)
				curveTo(8.01950f, 9.39450f, 7.91420f, 9.64880f, 7.91420f, 9.9140f)
				curveTo(7.91420f, 10.17910f, 8.01950f, 10.43340f, 8.2070f, 10.6210f)
				lineTo(11.036f, 13.45f)
				curveTo(11.22460f, 13.63210f, 11.47720f, 13.73290f, 11.73940f, 13.73060f)
				curveTo(12.00160f, 13.72840f, 12.25240f, 13.62320f, 12.43780f, 13.43780f)
				curveTo(12.62320f, 13.25240f, 12.72840f, 13.00160f, 12.73070f, 12.73940f)
				curveTo(12.7330f, 12.47720f, 12.63220f, 12.22460f, 12.450f, 12.0360f)
				lineTo(9.62f, 9.20697f)
				curveTo(9.43250f, 9.01950f, 9.17820f, 8.91420f, 8.9130f, 8.91420f)
				curveTo(8.64780f, 8.91420f, 8.39450f, 9.01950f, 8.2070f, 9.2070f)
				close()
			}
		}.build()
		return _Timer!!
	}

private var _Timer: ImageVector? = null
