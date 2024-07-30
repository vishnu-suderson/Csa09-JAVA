class NumArray {
    private int[] segmentTree;
    private int n;

    public NumArray(int[] nums) {
        if (nums.length > 0) {
            n = nums.length;
            segmentTree = new int[n * 4];
            buildSegmentTree(nums, 0, 0, n - 1);
        }
    }

    private void buildSegmentTree(int[] nums, int treeIndex, int lo, int hi) {
        if (lo == hi) {
            segmentTree[treeIndex] = nums[lo];
            return;
        }

        int mid = lo + (hi - lo) / 2;
        buildSegmentTree(nums, 2 * treeIndex + 1, lo, mid);
        buildSegmentTree(nums, 2 * treeIndex + 2, mid + 1, hi);
        segmentTree[treeIndex] = segmentTree[2 * treeIndex + 1] + segmentTree[2 * treeIndex + 2];
    }

    public void update(int index, int val) {
        updateSegmentTree(0, 0, n - 1, index, val);
    }

    private void updateSegmentTree(int treeIndex, int lo, int hi, int index, int val) {
        if (lo == hi) {
            segmentTree[treeIndex] = val;
            return;
        }

        int mid = lo + (hi - lo) / 2;
        if (index <= mid) {
            updateSegmentTree(2 * treeIndex + 1, lo, mid, index, val);
        } else {
            updateSegmentTree(2 * treeIndex + 2, mid + 1, hi, index, val);
        }
        segmentTree[treeIndex] = segmentTree[2 * treeIndex + 1] + segmentTree[2 * treeIndex + 2];
    }

    public int sumRange(int left, int right) {
        return querySegmentTree(0, 0, n - 1, left, right);
    }

    private int querySegmentTree(int treeIndex, int lo, int hi, int left, int right) {
        if (lo > right || hi < left) {
            return 0;
        }

        if (lo >= left && hi <= right) {
            return segmentTree[treeIndex];
        }

        int mid = lo + (hi - lo) / 2;
        int leftSum = querySegmentTree(2 * treeIndex + 1, lo, mid, left, right);
        int rightSum = querySegmentTree(2 * treeIndex + 2, mid + 1, hi, left, right);
        return leftSum + rightSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5};
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2));  // Output: 9
        numArray.update(1, 2);                       // nums = [1, 2, 5]
        System.out.println(numArray.sumRange(0, 2)); // Output: 8
    }
}
