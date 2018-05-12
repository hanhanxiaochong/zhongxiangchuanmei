package com.hanhanxiaochong.zhongxiangchuanmei.view.main.act;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

import com.hanhanxiaochong.zhongxiangchuanmei.R;
import com.hanhanxiaochong.zhongxiangchuanmei.view.base.BaseFragment;
import com.hanhanxiaochong.zhongxiangchuanmei.view.main.adapter.OrderAdapter;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by dahei on 2018/1/2.
 */

public class AllFragment extends BaseFragment {
    @BindView(R.id.points_order_recyclerview)
    RecyclerView recycler;
    @BindView(R.id.smart)
    SmartRefreshLayout smart;
    Unbinder unbinder;
    private ArrayList<String> datas;
    public int i;
//    private List<OrderList> orderList;

//    public OrderListBiz biz;

    public int sumPage;
    public int currentPage = 1;
    private OrderAdapter orderAdapter;
    //    private PointsOrderAdapter pointsOrderAdapter;
    private int page;

    @Override
    protected View getMyView() {
        return LayoutInflater.from(getContext()).inflate(R.layout.fragment_points_allorder, null);
    }

    //当当前fragment不可见时 清空数据
    protected void onInvisible() {
//        if(orderList!=null){
//            orderList.clear();
//            Log.e("size",orderList.size()+"");
//
//        }
//        if(biz!=null){
//            biz=null;
//        }
    }

    @Override
    protected void init() {
        List<String> s1 = new ArrayList<>();
        s1.add("1");
        s1.add("2");
        recycler.setLayoutManager(new LinearLayoutManager(getContext()));
//        if (i == 0){
//            banner.setVisibility(View.VISIBLE);
//        }
//        orderAdapter = new OrderAdapter(getContext(), R.layout.item_shop, s1);
        recycler.setAdapter(orderAdapter);
        switch (i) {
            case 0:
                cleanData();
                currentPage = 1;
                caseAll("", 1);
                break;
            case 1:
//                if(activity.points){
//                    cleanData();
//                    currentPage=1;
//                    caseShip("2",1);
//                }else{
//                    cleanData();
//                    currentPage=1;
//                    casePay("1",1);
//                }
                break;
            case 2:
//                if(activity.points){
//                    cleanData();
//                    currentPage=1;
//                    caseRevici("3",1);
//                }else{
//                    cleanData();
//                    currentPage=1;
//                    caseShip("2",1);
//                }
                break;
            case 3:
                cleanData();
                currentPage = 1;
                caseRevici("3", 1);
                break;
            case 4:
                cleanData();
                currentPage = 1;
                caseEvluation("4", 1);
                break;
            case 5:
                cleanData();
                currentPage = 1;
                caseRefund("6", 1);
                break;
            default:
                break;
        }
    }

    private void cleanData() {
//        if(orderList!=null){
//            orderList.clear();
//        }
    }

    //退款
    public void caseRefund(String indent_state, int page) {
        if (page > 1) {
//            activity.netAll(indent_state, page);
//            activity.setOnRefundOrderList(new AllPointsOrderActivity.OnRefundOrderList() {
//                @Override
//                public void refundOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        setLLVisible(true);
//                        setData(biz);
//                    } else {
//                        smart.finishLoadmoreWithNoMoreData();
//                    }
//                }
//            });
//
//        }else{
//            smart.resetNoMoreData();
//            activity.netAll(indent_state, page);
//            activity.setOnRefundOrderList(new AllPointsOrderActivity.OnRefundOrderList() {
//                @Override
//                public void refundOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                        setRecycler();
//                    } else {
//                        setLLVisible(false);
//                        smart.setEnableLoadmore(false);
//                    }
//                }
//            });
        }
    }

    //待评价
    public void caseEvluation(String indent_state, int page) {
        if (page > 1) {
//            activity.netAll(indent_state, page);
//            activity.setOnEvluationOrderList(new AllPointsOrderActivity.OnEvluationOrderList() {
//                @Override
//                public void evluationOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        setLLVisible(true);
//                        setData(biz);
//                    } else {
//                        smart.finishLoadmoreWithNoMoreData();
//                    }
//                }
//            });
//        }else{
//            smart.resetNoMoreData();
//            activity.netAll(indent_state, page);
//            activity.setOnEvluationOrderList(new AllPointsOrderActivity.OnEvluationOrderList() {
//                @Override
//                public void evluationOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                        setRecycler();
//                    } else {
//                        setLLVisible(false);
//                        smart.setEnableLoadmore(false);
//                    }
//                }
//            });
        }
    }

    //待收货
    public void caseRevici(String indent_state, int page) {
        if (page > 1) {
//            activity.netAll(indent_state, page);
//            activity.setOnReceivOrderList(new AllPointsOrderActivity.OnReceivOrderList() {
//                @Override
//                public void receivOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        setLLVisible(true);
//                        setData(biz);
//                    } else {
//                        smart.finishLoadmoreWithNoMoreData();
//                    }
//                }
//            });
//        }else{
//            smart.resetNoMoreData();
//            activity.netAll(indent_state, page);
//            activity.setOnReceivOrderList(new AllPointsOrderActivity.OnReceivOrderList() {
//                @Override
//                public void receivOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                        setRecycler();
//                    } else {
//                        setLLVisible(false);
//                        smart.setEnableLoadmore(false);
//                    }
//                }
//            });
        }
    }

    //待发货订单
    public void caseShip(String indent_state, int page) {
        if (page > 1) {
//            activity.netAll(indent_state, page);
//            activity.setOnShipOrderList(new AllPointsOrderActivity.OnShipOrderList() {
//                @Override
//                public void shipOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                    } else {
//                        smart.finishLoadmoreWithNoMoreData();
//                    }
//                }
//            });
//        }else{
//            smart.resetNoMoreData();
//            activity.netAll(indent_state, page);
//            activity.setOnShipOrderList(new AllPointsOrderActivity.OnShipOrderList() {
//                @Override
//                public void shipOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        setLLVisible(true);
//                        setData(biz);
//                        setRecycler();
//                    } else {
//                        setLLVisible(false);
//                        smart.setEnableLoadmore(false);
//                    }
//                }
//            });
        }
    }

    //代付款订单
    public void casePay(String indent_state, int page) {
        if (page > 1) {
//            activity.netAll(indent_state, page);
//            activity.setOnPayOrderList(new AllPointsOrderActivity.OnPayOrderList() {
//                @Override
//                public void PayOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        setLLVisible(true);
//                        setData(biz);
//                    } else {
//                        smart.finishLoadmoreWithNoMoreData();
//                    }
//                }
//            });
//        }else{
//            smart.resetNoMoreData();
//            activity.netAll(indent_state, page);
//            activity.setOnPayOrderList(new AllPointsOrderActivity.OnPayOrderList() {
//                @Override
//                public void PayOrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                        setRecycler();
//                    } else {
//                        setLLVisible(false);
//                        smart.setEnableLoadmore(false);
//                    }
//                }
//            });
        }
    }

    //加载全都订单
    public void caseAll(String indent_state, int page) {
        this.page = page;
        if (page > 1) {
//            activity.netsecondAll(indent_state, page);
//            activity.setOnOrderList(new AllPointsOrderActivity.OnOrderList() {
//                @Override
//                public void OrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                    }else{
//                        smart.finishLoadmoreWithNoMoreData();
//                    }
//                }
//            });
//        } else {
//            smart.resetNoMoreData();
//            activity.netAll(indent_state, page);
//            activity.setOnOrderList(new AllPointsOrderActivity.OnOrderList() {
//                @Override
//                public void OrderList(OrderListBiz biz) {
//                    if (biz != null && biz.getList() != null && biz.getList().size() > 0) {
//                        sumPage = biz.getTotalPage();
//                        setLLVisible(true);
//                        setData(biz);
//                        setRecycler();
//                    } else {
//                        setLLVisible(false);
//                        smart.setEnableLoadmore(false);
//                    }
//                }
//            });
        }
    }

    private void setLLVisible(boolean b) {
//        llWudingdan.setVisibility(View.GONE);
//        recycler.setVisibility(View.GONE);
//        if (b) {
//            recycler.setVisibility(View.VISIBLE);
//        } else {
//            llWudingdan.setVisibility(View.VISIBLE);
//        }
    }

    //设置数据
//    private void setData(OrderListBiz biz) {
//        if(page>1){
//            List<OrderList> list = biz.getList();
//            if (orderList != null) {
//            orderList.clear();
//                orderList.addAll(list);
//            } else {
//                orderList = list;
//            }
//        }else{
//            List<OrderList> list = biz.getList();
//            if (orderList != null) {
//                orderList.clear();
//                orderList.addAll(list);
//            } else {
//                orderList = list;
//            }
//        }
//    }

    @Override
    protected void initPresenter() {

    }

    @Override
    protected void listen() {
//        setRecycler();
        smart.setEnableRefresh(false);
        smart.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle
                .Scale));

    }

    private void setRecycler() {
//        if (orderList != null && orderList.size() > 0) {
//            recycler.setLayoutManager(new LinearLayoutManager(getContext()));
//            if (activity.points){
//                pointsOrderAdapter = new PointsOrderAdapter(getContext(), R.layout
// .item_points_order, orderList, AllFragment.this);
//                recycler.setAdapter(pointsOrderAdapter);
//                smart.setOnLoadmoreListener(new OnLoadmoreListener() {
//                    @Override
//                    public void onLoadmore(RefreshLayout refreshlayout) {
//                        loadMoreData();
//                    }
//                });
//            }else {
//
//                adapter = new AllOrderAdapter(getContext(), R.layout.item_points_allorder,
// orderList, i, AllFragment.this);
//                recycler.setAdapter(adapter);
//                smart.setOnLoadmoreListener(new OnLoadmoreListener() {
//                    @Override
//                    public void onLoadmore(RefreshLayout refreshlayout) {
//                        loadMoreData();
//                    }
//                });
//            }
//        }
    }

    private void loadMoreData() {
        if (currentPage == sumPage) {
            smart.finishLoadmoreWithNoMoreData();
        } else {
            currentPage++;
            switch (i) {
                case 0:
                    caseAll("", currentPage);
                    break;
                case 1:
                    casePay("1", currentPage);
                    break;
                case 2:
                    caseShip("2", currentPage);
                    break;
                case 3:
                    caseRevici("3", currentPage);
                    break;
                case 4:
                    caseEvluation("4", currentPage);
                    break;
                case 5:
                    caseRefund("6", currentPage);
                    break;
            }
//            if (activity.points){
//                pointsOrderAdapter.notifyDataSetChanged();
//            }else {
//                adapter.notifyDataSetChanged();
//            }
            smart.finishLoadmore();
        }
    }

    public void setPosition(int i) {
        this.i = i;
    }

}
