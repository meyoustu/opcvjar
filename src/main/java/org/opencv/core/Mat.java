package org.opencv.core;

import java.nio.ByteBuffer;

// C++: class Mat
//javadoc: Mat
public class Mat {

    public final long nativeObj;

    public Mat(final long addr) {
        if (addr == 0) {
            throw new UnsupportedOperationException("Native object address is NULL");
        }
        nativeObj = addr;
    }

    //
    // C++: Mat::Mat()
    //

    // javadoc: Mat::Mat()
    public Mat() {
        nativeObj = n_Mat();
    }

    //
    // C++: Mat::Mat(int rows, int cols, int type)
    //

    // javadoc: Mat::Mat(rows, cols, type)
    public Mat(final int rows, final int cols, final int type) {
        nativeObj = n_Mat(rows, cols, type);
    }

    //
    // C++: Mat::Mat(int rows, int cols, int type, void* data)
    //

    // javadoc: Mat::Mat(rows, cols, type, data)
    public Mat(final int rows, final int cols, final int type, final ByteBuffer data) {
        nativeObj = n_Mat(rows, cols, type, data);
    }

    //
    // C++: Mat::Mat(int rows, int cols, int type, void* data, size_t step)
    //

    // javadoc: Mat::Mat(rows, cols, type, data, step)
    public Mat(final int rows, final int cols, final int type, final ByteBuffer data, final long step) {
        nativeObj = n_Mat(rows, cols, type, data, step);
    }

    //
    // C++: Mat::Mat(Size size, int type)
    //

    // javadoc: Mat::Mat(size, type)
    public Mat(final Size size, final int type) {
        nativeObj = n_Mat(size.width, size.height, type);
    }

    //
    // C++: Mat::Mat(int ndims, const int* sizes, int type)
    //

    // javadoc: Mat::Mat(sizes, type)
    public Mat(final int[] sizes, final int type) {
        nativeObj = n_Mat(sizes.length, sizes, type);
    }

    //
    // C++: Mat::Mat(int rows, int cols, int type, Scalar s)
    //

    // javadoc: Mat::Mat(rows, cols, type, s)
    public Mat(final int rows, final int cols, final int type, final Scalar s) {
        nativeObj = n_Mat(rows, cols, type, s.val[0], s.val[1], s.val[2], s.val[3]);
    }

    //
    // C++: Mat::Mat(Size size, int type, Scalar s)
    //

    // javadoc: Mat::Mat(size, type, s)
    public Mat(final Size size, final int type, final Scalar s) {
        nativeObj = n_Mat(size.width, size.height, type, s.val[0], s.val[1], s.val[2], s.val[3]);
    }

    //
    // C++: Mat::Mat(int ndims, const int* sizes, int type, Scalar s)
    //

    // javadoc: Mat::Mat(sizes, type, s)
    public Mat(final int[] sizes, final int type, final Scalar s) {
        nativeObj = n_Mat(sizes.length, sizes, type, s.val[0], s.val[1], s.val[2], s.val[3]);
    }

    //
    // C++: Mat::Mat(Mat m, Range rowRange, Range colRange = Range::all())
    //

    // javadoc: Mat::Mat(m, rowRange, colRange)
    public Mat(final Mat m, final Range rowRange, final Range colRange) {
        nativeObj = n_Mat(m.nativeObj, rowRange.start, rowRange.end, colRange.start, colRange.end);
    }

    // javadoc: Mat::Mat(m, rowRange)
    public Mat(final Mat m, final Range rowRange) {
        nativeObj = n_Mat(m.nativeObj, rowRange.start, rowRange.end);
    }

    //
    // C++: Mat::Mat(const Mat& m, const std::vector<Range>& ranges)
    //

    // javadoc: Mat::Mat(m, ranges)
    public Mat(final Mat m, final Range[] ranges) {
        nativeObj = n_Mat(m.nativeObj, ranges);
    }

    //
    // C++: Mat::Mat(Mat m, Rect roi)
    //

    // javadoc: Mat::Mat(m, roi)
    public Mat(final Mat m, final Rect roi) {
        nativeObj = n_Mat(m.nativeObj, roi.y, roi.y + roi.height, roi.x, roi.x + roi.width);
    }

    //
    // C++: Mat Mat::adjustROI(int dtop, int dbottom, int dleft, int dright)
    //

    // javadoc: Mat::adjustROI(dtop, dbottom, dleft, dright)
    public Mat adjustROI(final int dtop, final int dbottom, final int dleft, final int dright) {
        return new Mat(n_adjustROI(nativeObj, dtop, dbottom, dleft, dright));
    }

    //
    // C++: void Mat::assignTo(Mat m, int type = -1)
    //

    // javadoc: Mat::assignTo(m, type)
    public void assignTo(final Mat m, final int type) {
        n_assignTo(nativeObj, m.nativeObj, type);
    }

    // javadoc: Mat::assignTo(m)
    public void assignTo(final Mat m) {
        n_assignTo(nativeObj, m.nativeObj);
    }

    //
    // C++: int Mat::channels()
    //

    // javadoc: Mat::channels()
    public int channels() {
        return n_channels(nativeObj);
    }

    //
    // C++: int Mat::checkVector(int elemChannels, int depth = -1, bool
    // requireContinuous = true)
    //

    // javadoc: Mat::checkVector(elemChannels, depth, requireContinuous)
    public int checkVector(final int elemChannels, final int depth, final boolean requireContinuous) {
        return n_checkVector(nativeObj, elemChannels, depth, requireContinuous);
    }

    // javadoc: Mat::checkVector(elemChannels, depth)
    public int checkVector(final int elemChannels, final int depth) {
        return n_checkVector(nativeObj, elemChannels, depth);
    }

    // javadoc: Mat::checkVector(elemChannels)
    public int checkVector(final int elemChannels) {
        return n_checkVector(nativeObj, elemChannels);
    }

    //
    // C++: Mat Mat::clone()
    //

    // javadoc: Mat::clone()
    public Mat clone() {
        return new Mat(n_clone(nativeObj));
    }

    //
    // C++: Mat Mat::col(int x)
    //

    // javadoc: Mat::col(x)
    public Mat col(final int x) {
        return new Mat(n_col(nativeObj, x));
    }

    //
    // C++: Mat Mat::colRange(int startcol, int endcol)
    //

    // javadoc: Mat::colRange(startcol, endcol)
    public Mat colRange(final int startcol, final int endcol) {
        return new Mat(n_colRange(nativeObj, startcol, endcol));
    }

    //
    // C++: Mat Mat::colRange(Range r)
    //

    // javadoc: Mat::colRange(r)
    public Mat colRange(final Range r) {
        return new Mat(n_colRange(nativeObj, r.start, r.end));
    }

    //
    // C++: int Mat::dims()
    //

    // javadoc: Mat::dims()
    public int dims() {
        return n_dims(nativeObj);
    }

    //
    // C++: int Mat::cols()
    //

    // javadoc: Mat::cols()
    public int cols() {
        return n_cols(nativeObj);
    }

    //
    // C++: void Mat::convertTo(Mat& m, int rtype, double alpha = 1, double beta
    // = 0)
    //

    // javadoc: Mat::convertTo(m, rtype, alpha, beta)
    public void convertTo(final Mat m, final int rtype, final double alpha, final double beta) {
        n_convertTo(nativeObj, m.nativeObj, rtype, alpha, beta);
    }

    // javadoc: Mat::convertTo(m, rtype, alpha)
    public void convertTo(final Mat m, final int rtype, final double alpha) {
        n_convertTo(nativeObj, m.nativeObj, rtype, alpha);
    }

    // javadoc: Mat::convertTo(m, rtype)
    public void convertTo(final Mat m, final int rtype) {
        n_convertTo(nativeObj, m.nativeObj, rtype);
    }

    //
    // C++: void Mat::copyTo(Mat& m)
    //

    // javadoc: Mat::copyTo(m)
    public void copyTo(final Mat m) {
        n_copyTo(nativeObj, m.nativeObj);
    }

    //
    // C++: void Mat::copyTo(Mat& m, Mat mask)
    //

    // javadoc: Mat::copyTo(m, mask)
    public void copyTo(final Mat m, final Mat mask) {
        n_copyTo(nativeObj, m.nativeObj, mask.nativeObj);
    }

    //
    // C++: void Mat::create(int rows, int cols, int type)
    //

    // javadoc: Mat::create(rows, cols, type)
    public void create(final int rows, final int cols, final int type) {
        n_create(nativeObj, rows, cols, type);
    }

    //
    // C++: void Mat::create(Size size, int type)
    //

    // javadoc: Mat::create(size, type)
    public void create(final Size size, final int type) {
        n_create(nativeObj, size.width, size.height, type);
    }

    //
    // C++: void Mat::create(int ndims, const int* sizes, int type)
    //

    // javadoc: Mat::create(sizes, type)
    public void create(final int[] sizes, final int type) {
        n_create(nativeObj, sizes.length, sizes, type);
    }

    //
    // C++: void Mat::copySize(const Mat& m);
    //

    // javadoc: Mat::copySize(m)
    public void copySize(final Mat m) {
        n_copySize(nativeObj, m.nativeObj);
    }

    //
    // C++: Mat Mat::cross(Mat m)
    //

    // javadoc: Mat::cross(m)
    public Mat cross(final Mat m) {
        return new Mat(n_cross(nativeObj, m.nativeObj));
    }

    //
    // C++: long Mat::dataAddr()
    //

    // javadoc: Mat::dataAddr()
    public long dataAddr() {
        return n_dataAddr(nativeObj);
    }

    //
    // C++: int Mat::depth()
    //

    // javadoc: Mat::depth()
    public int depth() {
        return n_depth(nativeObj);
    }

    //
    // C++: Mat Mat::diag(int d = 0)
    //

    // javadoc: Mat::diag(d)
    public Mat diag(final int d) {
        return new Mat(n_diag(nativeObj, d));
    }

    // javadoc: Mat::diag()
    public Mat diag() {
        return new Mat(n_diag(nativeObj, 0));
    }

    //
    // C++: static Mat Mat::diag(Mat d)
    //

    // javadoc: Mat::diag(d)
    public static Mat diag(final Mat d) {
        return new Mat(n_diag(d.nativeObj));
    }

    //
    // C++: double Mat::dot(Mat m)
    //

    // javadoc: Mat::dot(m)
    public double dot(final Mat m) {
        return n_dot(nativeObj, m.nativeObj);
    }

    //
    // C++: size_t Mat::elemSize()
    //

    // javadoc: Mat::elemSize()
    public long elemSize() {
        return n_elemSize(nativeObj);
    }

    //
    // C++: size_t Mat::elemSize1()
    //

    // javadoc: Mat::elemSize1()
    public long elemSize1() {
        return n_elemSize1(nativeObj);
    }

    //
    // C++: bool Mat::empty()
    //

    // javadoc: Mat::empty()
    public boolean empty() {
        return n_empty(nativeObj);
    }

    //
    // C++: static Mat Mat::eye(int rows, int cols, int type)
    //

    // javadoc: Mat::eye(rows, cols, type)
    public static Mat eye(final int rows, final int cols, final int type) {
        return new Mat(n_eye(rows, cols, type));
    }

    //
    // C++: static Mat Mat::eye(Size size, int type)
    //

    // javadoc: Mat::eye(size, type)
    public static Mat eye(final Size size, final int type) {
        return new Mat(n_eye(size.width, size.height, type));
    }

    //
    // C++: Mat Mat::inv(int method = DECOMP_LU)
    //

    // javadoc: Mat::inv(method)
    public Mat inv(final int method) {
        return new Mat(n_inv(nativeObj, method));
    }

    // javadoc: Mat::inv()
    public Mat inv() {
        return new Mat(n_inv(nativeObj));
    }

    //
    // C++: bool Mat::isContinuous()
    //

    // javadoc: Mat::isContinuous()
    public boolean isContinuous() {
        return n_isContinuous(nativeObj);
    }

    //
    // C++: bool Mat::isSubmatrix()
    //

    // javadoc: Mat::isSubmatrix()
    public boolean isSubmatrix() {
        return n_isSubmatrix(nativeObj);
    }

    //
    // C++: void Mat::locateROI(Size wholeSize, Point ofs)
    //

    // javadoc: Mat::locateROI(wholeSize, ofs)
    public void locateROI(final Size wholeSize, final Point ofs) {
        final double[] wholeSize_out = new double[2];
        final double[] ofs_out = new double[2];
        locateROI_0(nativeObj, wholeSize_out, ofs_out);
        if (wholeSize != null) {
            wholeSize.width = wholeSize_out[0];
            wholeSize.height = wholeSize_out[1];
        }
        if (ofs != null) {
            ofs.x = ofs_out[0];
            ofs.y = ofs_out[1];
        }
    }

    //
    // C++: Mat Mat::mul(Mat m, double scale = 1)
    //

    // javadoc: Mat::mul(m, scale)
    public Mat mul(final Mat m, final double scale) {
        return new Mat(n_mul(nativeObj, m.nativeObj, scale));
    }

    // javadoc: Mat::mul(m)
    public Mat mul(final Mat m) {
        return new Mat(n_mul(nativeObj, m.nativeObj));
    }

    //
    // C++: static Mat Mat::ones(int rows, int cols, int type)
    //

    // javadoc: Mat::ones(rows, cols, type)
    public static Mat ones(final int rows, final int cols, final int type) {
        return new Mat(n_ones(rows, cols, type));
    }

    //
    // C++: static Mat Mat::ones(Size size, int type)
    //

    // javadoc: Mat::ones(size, type)
    public static Mat ones(final Size size, final int type) {
        return new Mat(n_ones(size.width, size.height, type));
    }

    //
    // C++: static Mat Mat::ones(int ndims, const int* sizes, int type)
    //

    // javadoc: Mat::ones(sizes, type)
    public static Mat ones(final int[] sizes, final int type) {
        return new Mat(n_ones(sizes.length, sizes, type));
    }

    //
    // C++: void Mat::push_back(Mat m)
    //

    // javadoc: Mat::push_back(m)
    public void push_back(final Mat m) {
        n_push_back(nativeObj, m.nativeObj);
    }

    //
    // C++: void Mat::release()
    //

    // javadoc: Mat::release()
    public void release() {
        n_release(nativeObj);
    }

    //
    // C++: Mat Mat::reshape(int cn, int rows = 0)
    //

    // javadoc: Mat::reshape(cn, rows)
    public Mat reshape(final int cn, final int rows) {
        return new Mat(n_reshape(nativeObj, cn, rows));
    }

    // javadoc: Mat::reshape(cn)
    public Mat reshape(final int cn) {
        return new Mat(n_reshape(nativeObj, cn));
    }

    //
    // C++: Mat Mat::reshape(int cn, int newndims, const int* newsz)
    //

    // javadoc: Mat::reshape(cn, newshape)
    public Mat reshape(final int cn, final int[] newshape) {
        return new Mat(n_reshape_1(nativeObj, cn, newshape.length, newshape));
    }

    //
    // C++: Mat Mat::row(int y)
    //

    // javadoc: Mat::row(y)
    public Mat row(final int y) {
        return new Mat(n_row(nativeObj, y));
    }

    //
    // C++: Mat Mat::rowRange(int startrow, int endrow)
    //

    // javadoc: Mat::rowRange(startrow, endrow)
    public Mat rowRange(final int startrow, final int endrow) {
        return new Mat(n_rowRange(nativeObj, startrow, endrow));
    }

    //
    // C++: Mat Mat::rowRange(Range r)
    //

    // javadoc: Mat::rowRange(r)
    public Mat rowRange(final Range r) {
        return new Mat(n_rowRange(nativeObj, r.start, r.end));
    }

    //
    // C++: int Mat::rows()
    //

    // javadoc: Mat::rows()
    public int rows() {
        return n_rows(nativeObj);
    }

    //
    // C++: Mat Mat::operator =(Scalar s)
    //

    // javadoc: Mat::operator =(s)
    public Mat setTo(final Scalar s) {
        return new Mat(n_setTo(nativeObj, s.val[0], s.val[1], s.val[2], s.val[3]));
    }

    //
    // C++: Mat Mat::setTo(Scalar value, Mat mask = Mat())
    //

    // javadoc: Mat::setTo(value, mask)
    public Mat setTo(final Scalar value, final Mat mask) {
        return new Mat(n_setTo(nativeObj, value.val[0], value.val[1], value.val[2], value.val[3], mask.nativeObj));
    }

    //
    // C++: Mat Mat::setTo(Mat value, Mat mask = Mat())
    //

    // javadoc: Mat::setTo(value, mask)
    public Mat setTo(final Mat value, final Mat mask) {
        return new Mat(n_setTo(nativeObj, value.nativeObj, mask.nativeObj));
    }

    // javadoc: Mat::setTo(value)
    public Mat setTo(final Mat value) {
        return new Mat(n_setTo(nativeObj, value.nativeObj));
    }

    //
    // C++: Size Mat::size()
    //

    // javadoc: Mat::size()
    public Size size() {
        return new Size(n_size(nativeObj));
    }

    //
    // C++: int Mat::size(int i)
    //

    // javadoc: Mat::size(int i)
    public int size(final int i) {
        return n_size_i(nativeObj, i);
    }

    //
    // C++: size_t Mat::step1(int i = 0)
    //

    // javadoc: Mat::step1(i)
    public long step1(final int i) {
        return n_step1(nativeObj, i);
    }

    // javadoc: Mat::step1()
    public long step1() {
        return n_step1(nativeObj);
    }

    //
    // C++: Mat Mat::operator()(int rowStart, int rowEnd, int colStart, int
    // colEnd)
    //

    // javadoc: Mat::operator()(rowStart, rowEnd, colStart, colEnd)
    public Mat submat(final int rowStart, final int rowEnd, final int colStart, final int colEnd) {
        return new Mat(n_submat_rr(nativeObj, rowStart, rowEnd, colStart, colEnd));
    }

    //
    // C++: Mat Mat::operator()(Range rowRange, Range colRange)
    //

    // javadoc: Mat::operator()(rowRange, colRange)
    public Mat submat(final Range rowRange, final Range colRange) {
        return new Mat(n_submat_rr(nativeObj, rowRange.start, rowRange.end, colRange.start, colRange.end));
    }

    //
    // C++: Mat Mat::operator()(const std::vector<Range>& ranges)
    //

    // javadoc: Mat::operator()(ranges[])
    public Mat submat(final Range[] ranges) {
        return new Mat(n_submat_ranges(nativeObj, ranges));
    }

    //
    // C++: Mat Mat::operator()(Rect roi)
    //

    // javadoc: Mat::operator()(roi)
    public Mat submat(final Rect roi) {
        return new Mat(n_submat(nativeObj, roi.x, roi.y, roi.width, roi.height));
    }

    //
    // C++: Mat Mat::t()
    //

    // javadoc: Mat::t()
    public Mat t() {
        return new Mat(n_t(nativeObj));
    }

    //
    // C++: size_t Mat::total()
    //

    // javadoc: Mat::total()
    public long total() {
        return n_total(nativeObj);
    }

    //
    // C++: int Mat::type()
    //

    // javadoc: Mat::type()
    public int type() {
        return n_type(nativeObj);
    }

    //
    // C++: static Mat Mat::zeros(int rows, int cols, int type)
    //

    // javadoc: Mat::zeros(rows, cols, type)
    public static Mat zeros(final int rows, final int cols, final int type) {
        return new Mat(n_zeros(rows, cols, type));
    }

    //
    // C++: static Mat Mat::zeros(Size size, int type)
    //

    // javadoc: Mat::zeros(size, type)
    public static Mat zeros(final Size size, final int type) {
        return new Mat(n_zeros(size.width, size.height, type));
    }

    //
    // C++: static Mat Mat::zeros(int ndims, const int* sizes, int type)
    //

    // javadoc: Mat::zeros(sizes, type)
    public static Mat zeros(final int[] sizes, final int type) {
        return new Mat(n_zeros(sizes.length, sizes, type));
    }

    @Override
    protected void finalize() throws Throwable {
        n_delete(nativeObj);
        super.finalize();
    }

    // javadoc:Mat::toString()
    @Override
    public String toString() {
        String _dims = (dims() > 0) ? "" : "-1*-1*";
        for (int i = 0; i < dims(); i++) {
            _dims += size(i) + "*";
        }
        return "Mat [ " + _dims + CvType.typeToString(type()) + ", isCont=" + isContinuous() + ", isSubmat="
                + isSubmatrix() + ", nativeObj=0x" + Long.toHexString(nativeObj) + ", dataAddr=0x"
                + Long.toHexString(dataAddr()) + " ]";
    }

    // javadoc:Mat::dump()
    public String dump() {
        return nDump(nativeObj);
    }

    // javadoc:Mat::put(row,col,data)
    public int put(final int row, final int col, final double... data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        return nPutD(nativeObj, row, col, data.length, data);
    }

    // javadoc:Mat::put(idx,data)
    public int put(final int[] idx, final double... data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        return nPutDIdx(nativeObj, idx, data.length, data);
    }

    // javadoc:Mat::put(row,col,data)
    public int put(final int row, final int col, final float[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_32F) {
            return nPutF(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(idx,data)
    public int put(final int[] idx, final float[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_32F) {
            return nPutFIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(row,col,data)
    public int put(final int row, final int col, final int[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_32S) {
            return nPutI(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(idx,data)
    public int put(final int[] idx, final int[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_32S) {
            return nPutIIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(row,col,data)
    public int put(final int row, final int col, final short[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_16U || CvType.depth(t) == CvType.CV_16S) {
            return nPutS(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(idx,data)
    public int put(final int[] idx, final short[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_16U || CvType.depth(t) == CvType.CV_16S) {
            return nPutSIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(row,col,data)
    public int put(final int row, final int col, final byte[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_8U || CvType.depth(t) == CvType.CV_8S) {
            return nPutB(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(idx,data)
    public int put(final int[] idx, final byte[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_8U || CvType.depth(t) == CvType.CV_8S) {
            return nPutBIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(row,col,data,offset,length)
    public int put(final int row, final int col, final byte[] data, final int offset, final int length) {
        final int t = type();
        if (data == null || length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_8U || CvType.depth(t) == CvType.CV_8S) {
            return nPutBwOffset(nativeObj, row, col, length, offset, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::put(idx,data,offset,length)
    public int put(final int[] idx, final byte[] data, final int offset, final int length) {
        final int t = type();
        if (data == null || length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_8U || CvType.depth(t) == CvType.CV_8S) {
            return nPutBwIdxOffset(nativeObj, idx, length, offset, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(row,col,data)
    public int get(final int row, final int col, final byte[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_8U || CvType.depth(t) == CvType.CV_8S) {
            return nGetB(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(idx,data)
    public int get(final int[] idx, final byte[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_8U || CvType.depth(t) == CvType.CV_8S) {
            return nGetBIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(row,col,data)
    public int get(final int row, final int col, final short[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_16U || CvType.depth(t) == CvType.CV_16S) {
            return nGetS(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(idx,data)
    public int get(final int[] idx, final short[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_16U || CvType.depth(t) == CvType.CV_16S) {
            return nGetSIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(row,col,data)
    public int get(final int row, final int col, final int[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_32S) {
            return nGetI(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(idx,data)
    public int get(final int[] idx, final int[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_32S) {
            return nGetIIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(row,col,data)
    public int get(final int row, final int col, final float[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_32F) {
            return nGetF(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(idx,data)
    public int get(final int[] idx, final float[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_32F) {
            return nGetFIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(row,col,data)
    public int get(final int row, final int col, final double[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (CvType.depth(t) == CvType.CV_64F) {
            return nGetD(nativeObj, row, col, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(idx,data)
    public int get(final int[] idx, final double[] data) {
        final int t = type();
        if (data == null || data.length % CvType.channels(t) != 0) {
            throw new UnsupportedOperationException("Provided data element number (" + (data == null ? 0 : data.length)
                    + ") should be multiple of the Mat channels count (" + CvType.channels(t) + ")");
        }
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        if (CvType.depth(t) == CvType.CV_64F) {
            return nGetDIdx(nativeObj, idx, data.length, data);
        }
        throw new UnsupportedOperationException("Mat data type is not compatible: " + t);
    }

    // javadoc:Mat::get(row,col)
    public double[] get(final int row, final int col) {
        return nGet(nativeObj, row, col);
    }

    // javadoc:Mat::get(idx)
    public double[] get(final int[] idx) {
        if (idx.length != dims()) {
            throw new IllegalArgumentException("Incorrect number of indices");
        }
        return nGetIdx(nativeObj, idx);
    }

    // javadoc:Mat::height()
    public int height() {
        return rows();
    }

    // javadoc:Mat::width()
    public int width() {
        return cols();
    }

    // javadoc:Mat::getNativeObjAddr()
    public long getNativeObjAddr() {
        return nativeObj;
    }

    // C++: Mat::Mat()
    private static native long n_Mat();

    // C++: Mat::Mat(int rows, int cols, int type)
    private static native long n_Mat(int rows, int cols, int type);

    // C++: Mat::Mat(int ndims, const int* sizes, int type)
    private static native long n_Mat(int ndims, int[] sizes, int type);

    // C++: Mat::Mat(int rows, int cols, int type, void* data)
    private static native long n_Mat(int rows, int cols, int type, ByteBuffer data);

    // C++: Mat::Mat(int rows, int cols, int type, void* data, size_t step)
    private static native long n_Mat(int rows, int cols, int type, ByteBuffer data, long step);

    // C++: Mat::Mat(Size size, int type)
    private static native long n_Mat(double size_width, double size_height, int type);

    // C++: Mat::Mat(int rows, int cols, int type, Scalar s)
    private static native long n_Mat(int rows, int cols, int type, double s_val0, double s_val1, double s_val2,
            double s_val3);

    // C++: Mat::Mat(Size size, int type, Scalar s)
    private static native long n_Mat(double size_width, double size_height, int type, double s_val0, double s_val1,
            double s_val2, double s_val3);

    // C++: Mat::Mat(int ndims, const int* sizes, int type, Scalar s)
    private static native long n_Mat(int ndims, int[] sizes, int type, double s_val0, double s_val1, double s_val2,
            double s_val3);

    // C++: Mat::Mat(Mat m, Range rowRange, Range colRange = Range::all())
    private static native long n_Mat(long m_nativeObj, int rowRange_start, int rowRange_end, int colRange_start,
            int colRange_end);

    private static native long n_Mat(long m_nativeObj, int rowRange_start, int rowRange_end);

    // C++: Mat::Mat(const Mat& m, const std::vector<Range>& ranges)
    private static native long n_Mat(long m_nativeObj, Range[] ranges);

    // C++: Mat Mat::adjustROI(int dtop, int dbottom, int dleft, int dright)
    private static native long n_adjustROI(long nativeObj, int dtop, int dbottom, int dleft, int dright);

    // C++: void Mat::assignTo(Mat m, int type = -1)
    private static native void n_assignTo(long nativeObj, long m_nativeObj, int type);

    private static native void n_assignTo(long nativeObj, long m_nativeObj);

    // C++: int Mat::channels()
    private static native int n_channels(long nativeObj);

    // C++: int Mat::checkVector(int elemChannels, int depth = -1, bool
    // requireContinuous = true)
    private static native int n_checkVector(long nativeObj, int elemChannels, int depth, boolean requireContinuous);

    private static native int n_checkVector(long nativeObj, int elemChannels, int depth);

    private static native int n_checkVector(long nativeObj, int elemChannels);

    // C++: Mat Mat::clone()
    private static native long n_clone(long nativeObj);

    // C++: Mat Mat::col(int x)
    private static native long n_col(long nativeObj, int x);

    // C++: Mat Mat::colRange(int startcol, int endcol)
    private static native long n_colRange(long nativeObj, int startcol, int endcol);

    // C++: int Mat::dims()
    private static native int n_dims(long nativeObj);

    // C++: int Mat::cols()
    private static native int n_cols(long nativeObj);

    // C++: void Mat::convertTo(Mat& m, int rtype, double alpha = 1, double beta
    // = 0)
    private static native void n_convertTo(long nativeObj, long m_nativeObj, int rtype, double alpha, double beta);

    private static native void n_convertTo(long nativeObj, long m_nativeObj, int rtype, double alpha);

    private static native void n_convertTo(long nativeObj, long m_nativeObj, int rtype);

    // C++: void Mat::copyTo(Mat& m)
    private static native void n_copyTo(long nativeObj, long m_nativeObj);

    // C++: void Mat::copyTo(Mat& m, Mat mask)
    private static native void n_copyTo(long nativeObj, long m_nativeObj, long mask_nativeObj);

    // C++: void Mat::create(int rows, int cols, int type)
    private static native void n_create(long nativeObj, int rows, int cols, int type);

    // C++: void Mat::create(Size size, int type)
    private static native void n_create(long nativeObj, double size_width, double size_height, int type);

    // C++: void Mat::create(int ndims, const int* sizes, int type)
    private static native void n_create(long nativeObj, int ndims, int[] sizes, int type);

    // C++: void Mat::copySize(const Mat& m)
    private static native void n_copySize(long nativeObj, long m_nativeObj);

    // C++: Mat Mat::cross(Mat m)
    private static native long n_cross(long nativeObj, long m_nativeObj);

    // C++: long Mat::dataAddr()
    private static native long n_dataAddr(long nativeObj);

    // C++: int Mat::depth()
    private static native int n_depth(long nativeObj);

    // C++: Mat Mat::diag(int d = 0)
    private static native long n_diag(long nativeObj, int d);

    // C++: static Mat Mat::diag(Mat d)
    private static native long n_diag(long d_nativeObj);

    // C++: double Mat::dot(Mat m)
    private static native double n_dot(long nativeObj, long m_nativeObj);

    // C++: size_t Mat::elemSize()
    private static native long n_elemSize(long nativeObj);

    // C++: size_t Mat::elemSize1()
    private static native long n_elemSize1(long nativeObj);

    // C++: bool Mat::empty()
    private static native boolean n_empty(long nativeObj);

    // C++: static Mat Mat::eye(int rows, int cols, int type)
    private static native long n_eye(int rows, int cols, int type);

    // C++: static Mat Mat::eye(Size size, int type)
    private static native long n_eye(double size_width, double size_height, int type);

    // C++: Mat Mat::inv(int method = DECOMP_LU)
    private static native long n_inv(long nativeObj, int method);

    private static native long n_inv(long nativeObj);

    // C++: bool Mat::isContinuous()
    private static native boolean n_isContinuous(long nativeObj);

    // C++: bool Mat::isSubmatrix()
    private static native boolean n_isSubmatrix(long nativeObj);

    // C++: void Mat::locateROI(Size wholeSize, Point ofs)
    private static native void locateROI_0(long nativeObj, double[] wholeSize_out, double[] ofs_out);

    // C++: Mat Mat::mul(Mat m, double scale = 1)
    private static native long n_mul(long nativeObj, long m_nativeObj, double scale);

    private static native long n_mul(long nativeObj, long m_nativeObj);

    // C++: static Mat Mat::ones(int rows, int cols, int type)
    private static native long n_ones(int rows, int cols, int type);

    // C++: static Mat Mat::ones(Size size, int type)
    private static native long n_ones(double size_width, double size_height, int type);

    // C++: static Mat Mat::ones(int ndims, const int* sizes, int type)
    private static native long n_ones(int ndims, int[] sizes, int type);

    // C++: void Mat::push_back(Mat m)
    private static native void n_push_back(long nativeObj, long m_nativeObj);

    // C++: void Mat::release()
    private static native void n_release(long nativeObj);

    // C++: Mat Mat::reshape(int cn, int rows = 0)
    private static native long n_reshape(long nativeObj, int cn, int rows);

    private static native long n_reshape(long nativeObj, int cn);

    // C++: Mat Mat::reshape(int cn, int newndims, const int* newsz)
    private static native long n_reshape_1(long nativeObj, int cn, int newndims, int[] newsz);

    // C++: Mat Mat::row(int y)
    private static native long n_row(long nativeObj, int y);

    // C++: Mat Mat::rowRange(int startrow, int endrow)
    private static native long n_rowRange(long nativeObj, int startrow, int endrow);

    // C++: int Mat::rows()
    private static native int n_rows(long nativeObj);

    // C++: Mat Mat::operator =(Scalar s)
    private static native long n_setTo(long nativeObj, double s_val0, double s_val1, double s_val2, double s_val3);

    // C++: Mat Mat::setTo(Scalar value, Mat mask = Mat())
    private static native long n_setTo(long nativeObj, double s_val0, double s_val1, double s_val2, double s_val3,
            long mask_nativeObj);

    // C++: Mat Mat::setTo(Mat value, Mat mask = Mat())
    private static native long n_setTo(long nativeObj, long value_nativeObj, long mask_nativeObj);

    private static native long n_setTo(long nativeObj, long value_nativeObj);

    // C++: Size Mat::size()
    private static native double[] n_size(long nativeObj);

    // C++: int Mat::size(int i)
    private static native int n_size_i(long nativeObj, int i);

    // C++: size_t Mat::step1(int i = 0)
    private static native long n_step1(long nativeObj, int i);

    private static native long n_step1(long nativeObj);

    // C++: Mat Mat::operator()(Range rowRange, Range colRange)
    private static native long n_submat_rr(long nativeObj, int rowRange_start, int rowRange_end, int colRange_start,
            int colRange_end);

    // C++: Mat Mat::operator()(const std::vector<Range>& ranges)
    private static native long n_submat_ranges(long nativeObj, Range[] ranges);

    // C++: Mat Mat::operator()(Rect roi)
    private static native long n_submat(long nativeObj, int roi_x, int roi_y, int roi_width, int roi_height);

    // C++: Mat Mat::t()
    private static native long n_t(long nativeObj);

    // C++: size_t Mat::total()
    private static native long n_total(long nativeObj);

    // C++: int Mat::type()
    private static native int n_type(long nativeObj);

    // C++: static Mat Mat::zeros(int rows, int cols, int type)
    private static native long n_zeros(int rows, int cols, int type);

    // C++: static Mat Mat::zeros(Size size, int type)
    private static native long n_zeros(double size_width, double size_height, int type);

    // C++: static Mat Mat::zeros(int ndims, const int* sizes, int type)
    private static native long n_zeros(int ndims, int[] sizes, int type);

    // native support for java finalize()
    private static native void n_delete(long nativeObj);

    private static native int nPutD(long self, int row, int col, int count, double[] data);

    private static native int nPutDIdx(long self, int[] idx, int count, double[] data);

    private static native int nPutF(long self, int row, int col, int count, float[] data);

    private static native int nPutFIdx(long self, int[] idx, int count, float[] data);

    private static native int nPutI(long self, int row, int col, int count, int[] data);

    private static native int nPutIIdx(long self, int[] idx, int count, int[] data);

    private static native int nPutS(long self, int row, int col, int count, short[] data);

    private static native int nPutSIdx(long self, int[] idx, int count, short[] data);

    private static native int nPutB(long self, int row, int col, int count, byte[] data);

    private static native int nPutBIdx(long self, int[] idx, int count, byte[] data);

    private static native int nPutBwOffset(long self, int row, int col, int count, int offset, byte[] data);

    private static native int nPutBwIdxOffset(long self, int[] idx, int count, int offset, byte[] data);

    private static native int nGetB(long self, int row, int col, int count, byte[] vals);

    private static native int nGetBIdx(long self, int[] idx, int count, byte[] vals);

    private static native int nGetS(long self, int row, int col, int count, short[] vals);

    private static native int nGetSIdx(long self, int[] idx, int count, short[] vals);

    private static native int nGetI(long self, int row, int col, int count, int[] vals);

    private static native int nGetIIdx(long self, int[] idx, int count, int[] vals);

    private static native int nGetF(long self, int row, int col, int count, float[] vals);

    private static native int nGetFIdx(long self, int[] idx, int count, float[] vals);

    private static native int nGetD(long self, int row, int col, int count, double[] vals);

    private static native int nGetDIdx(long self, int[] idx, int count, double[] vals);

    private static native double[] nGet(long self, int row, int col);

    private static native double[] nGetIdx(long self, int[] idx);

    private static native String nDump(long self);
}